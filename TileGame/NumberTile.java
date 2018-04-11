public class NumberTile {
	private int num1, num2, num3, num4;
	private boolean sorted;
	
	public NumberTile() {
		//initializes tile with 4 random numbers
		num1 = (int)(Math.random()*9) + 1;
		num2 = (int)(Math.random()*9) + 1;
		num3 = (int)(Math.random()*9) + 1;
		num4 = (int)(Math.random()*9) + 1;
		//indicates that tile is unsorted
		sorted = false;
	}
	
	public void rotate() {
		//changes number assignments to simulate rotation
		int temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = num4;
		num4 = temp;
	}
	
	public int getTop() {
		//returns top for alignment of tile
		return num1;
	}
	
	public int getBottom() {
		//returns bottom for alignment of tile
		return num3;
	}
	
	public boolean isSorted() {
		//checks if tile is sorted or not
		return sorted;
	}
	
	public void sorted() {
		//marks if tile has been sorted
		sorted = true;
	}
	
	public String toString() {
		return "\n\t" + num1 + "\n" + num4 + "\t\t" + num2 + "\n\t" + num3 + "\n";
	}
}
