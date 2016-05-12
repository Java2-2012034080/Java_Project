package sample_0324;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[2][4];
		
		for(int j=0,r=1; j<2; j++){
			for(int i=0; i<4; i++,r++){
				array[j][i] = r;
				System.out.print(array[j][i]);
		}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
		int[] array2 = {1,3,5,10,6,7};
		for(int x : array2){ // for-each 구문 ... 최근
			System.out.println("xxxxx"+x);
		}
	}

}
