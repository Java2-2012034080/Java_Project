package test;
import java.util.*;
public class User {
	
	Scanner input = new Scanner(System.in);
	Process p = new Process();
	int menu;
	int i;
	int x,y;
	String s1,s2;
	
	void pr1(){
		System.out.println("계산할 연산자에 알맞는 숫자를 선택하세요");
		System.out.println("+ : 1\n- : 2\n* : 3\n/ : 4");
		i=input.nextInt();
		
		switch(i){
		case 1:
			System.out.print("숫자 두개를 입력하세요");
			p.plus(x, y);
			break;
		case 2:
			System.out.print("숫자 두개를 입력하세요");
			p.minus(x, y);
			break;
		case 3:
			System.out.print("숫자 두개를 입력하세요");
			p.supply(x, y);
			System.out.println(x);
			break;
		case 4:
			System.out.print("숫자 두개를 입력하세요");
			p.divide(x, y);
			break;
		default:
			System.out.print("유효한 숫자가 아닙니다.");
		}
	}
	void pr2(){
		System.out.println("문자열 두개를 입려하세요");
		p.apeend(s1, s2);
	}
}
