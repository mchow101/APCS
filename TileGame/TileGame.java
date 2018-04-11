import java.util.ArrayList;

public class TileGame {
	ArrayList<NumberTile> list = new ArrayList<NumberTile>(); //unsorted list
	ArrayList<NumberTile> board = new ArrayList<NumberTile>(); //sorted board
	
	public TileGame() {
		for(int i = 0; i < 9; i++) 
			list.add(new NumberTile());
		int placeHolder = 0;
		int inSize = list.size();
		boolean stillUpdating = true;
		System.out.println("Tiles: " + list);
		while(stillUpdating) {
			sort(placeHolder);
			placeHolder++;
			if(placeHolder >= list.size()) {
				//at end of the list, checks if the list has changed 
				//if not, this indicates that there is no more sorting left
				placeHolder = 0;
				stillUpdating = list.size() < inSize;
				inSize = list.size();
			}
		}
		System.out.println("Board: " + board + "\nUnsorted: " + list);
	}

	public void sort(int placeHolder) {
		NumberTile t = list.get(placeHolder);
		boolean unsorted = !t.isSorted();
		for(int r = 0; r < 4; r++) {
			if(unsorted) {
				t.rotate();
				//goes through 4 rotations if unsorted
				if(board.size() == 0) {
					//places first tile
					board.add(list.remove(placeHolder));
					unsorted = false;
				} else if(board.get(0).getTop() == t.getBottom()) {
					//places in first position
					board.add(0, list.remove(placeHolder));
					unsorted = false;
				} else if(board.get(board.size() - 1).getBottom() == t.getTop()) {
					//places in last position
					board.add(list.remove(placeHolder));
					unsorted = false;
				} else {
					//places in between
					for(int i = 1; i < board.size(); i++) {
						if(unsorted && board.get(i - 1).getBottom() == t.getTop() && t.getBottom() == board.get(i).getTop()) {
							board.add(i, list.remove(placeHolder));
							unsorted = false;
						}
					}
				}
			}
			//makes sure to go to next tile without skipping any
			if(unsorted) {
				placeHolder++;
			} else {
				t.sorted();
			}
			placeHolder--;
		}
	}
}
