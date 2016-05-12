package test;

import java.util.Scanner;

public class User_ {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		do{	
			System.out.println("menu");
			System.out.println("1. Arithmetic operation");
			System.out.println("2. Append Strings");
			System.out.println("3. Quit");
		
		Scanner input = new Scanner(System.in);
		Print_ u1 = new Print_();

		int a = input.nextInt();
		
		switch(a){
		case 1:
			u1.pr1();
			break;
		case 2:
			u1.pr2();
			break;
		case 3:
			System.out.println("시스템을 종료합니다.");
			break;
		default:
			System.out.println("메뉴를 확인해 주세요");
		
		}
		if(a==3){break;}
		}while(true);
	}

}
