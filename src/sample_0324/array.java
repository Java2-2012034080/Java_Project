package sample_0324;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[10];
		int[] array_2 = {2,3,4,2,1,3,4};
		
		for(int i=0; i<10; i++){
			array[i]= i*10;
		System.out.println(array[i]+" "+i);
		}
		
		array_2[0] = array_2[2] + array_2[4];
		
		
	}

}
