public class MitaliEncoder {
	public static void main(String[] args) {
		System.out.println(encode(5, 4, "Today is my birthday"));
	}
	
	public static String encode(int a, int b, String s) {
		String msg = "";
		char[][] arr = new char[a][b];
		int l = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(l < s.length()) {
					arr[i][j] = s.charAt(l);
					l++;
				} else {
					arr [i][j] = ' ';
				}
			}
		}
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				msg += arr[j][i];
			}
		}
		return msg;
	}
}
