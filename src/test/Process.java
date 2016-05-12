package test;
import java.util.*;
public class Process {
	
	int x,y;
	String s1,s2;
	Scanner input = new Scanner(System.in);
	
	void plus(int x, int y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x+y);
	}

	void plus(double x, double y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x+y);
	}
	
	
	void minus(int x, int y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x-y);
	}

	void minus(double x, double y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x-y);
	}
	
	void supply(int x, int y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x*y);
	}

	void supply(double x, double y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x*y);
	}
	
	void divide(int x, int y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println((double)x/y);
	}

	void divide(double x, double y){
		x=input.nextInt();
		y=input.nextInt();
		System.out.println(x/y);
	}
	
	
	void apeend(String s1, String s2){
		s1=input.nextLine();
		s2=input.nextLine();
		System.out.println(s1+s2);
		}
}
	