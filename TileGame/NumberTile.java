public class NumberTile {
	int num1, num2, num3, num4;
	
	public NumberTile() {
		num1 = (int)(Math.random()*9) + 1;
		num2 = (int)(Math.random()*9) + 1;
		num3 = (int)(Math.random()*9) + 1;
		num4 = (int)(Math.random()*9) + 1;
	}
	
	public void rotate() {
		int temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = num4;
		num4 = temp;
	}
	
	public int getLeft() {
		return num2;
	}
	
	public int getRight() {
		return num4;
	}
	
	public String toString() {
		return "\t" + num1 + "\n" + num4 + "\t\t" + num2 + "\n\t" + num3;
	}
}
