package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		/* here row length is i.length
		 * col length is i[0].length
		 * we can defined i[][] like this or [][]i this 
		*/
		
		int i[][] = new int [3][4];
		System.out.println(i.length);
		System.out.println(i[0].length +"\n");
		
		i[0][0] = 1;
		i[0][1] = 2;
		i[0][2] = 3;
		i[0][3] = 4;
		
		i[1][0] = 5;
		i[1][1] = 6;
		i[1][2] = 7;
		i[1][3] = 8;
		
		i[2][0] = 9;
		i[2][1] = 10;
		i[2][2] = 11;
		i[2][3] = 12;
		
		for(int row=0;row<i.length;row++) {
			for(int col=0;col<i[0].length;col++)
			{
				System.out.println(i[row][col]);
			}
		}

	}

}
