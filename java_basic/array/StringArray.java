package java_basic.array;

public class StringArray {

	public static void main(String[] args) {
		final int row = 5;
		final int col = 6;
		String [][] aTable = new String[row][col];
		char a = 'a';
		for(int r = 0;r < row;++r)
			for(int c = 0;c < col;++c){
				aTable[r][c] = " "+(a++);
			}
		for(int r = 0;r < row;++r){
			for(int c = 0;c < col;++c){
				System.out.print(aTable[r][c]+"\t");
				}
			System.out.println();
		}
	}

}
