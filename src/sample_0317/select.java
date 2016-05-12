package sample_0317;
import java.util.*;
public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("ют╥б");
		int x = input.nextInt();
		
		
		if(x == 0){
			System.out.println("0");
		}
		else if((x%2)==0){
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		int result;
		result=x%2;
		switch(result){
			case 0:
				System.out.println("even");
				break;
			case 1:
				System.out.println("odd");
				break;
		}
	}

}
