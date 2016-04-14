package sample_0317;
import java.util.*;
import java.util.Scanner;

public class Clac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5, y=9, result;
		result= x%y;
		
		System.out.println(result);
		
		x=2;
		y=2;
		
		result=x<<2;
		System.out.println(result);
		
		Scanner input = new Scanner(System.in); //입력을 받는 클래스를 새로 만듬???
		System.out.println("a를 입력하세요");
		int a = input.nextInt();
		System.out.println("b를 입력하세요");
		int b = input.nextInt();
		
		result=a*b;
		System.out.println(result);
		
		input.close();
	}

}
