package test;
import java.util.*;
public class Print_ {	
		Scanner input = new Scanner(System.in);
		Process p = new Process();
		int menu;
		int i;
		int x,y;
		String s1,s2;
		
		void pr1(){
			do{
			System.out.println("����� �����ڿ� �˸´� ���ڸ� �����ϼ���");
			System.out.println("+ : 1\n- : 2\n* : 3\n/ : 4\n����:5");
			i=input.nextInt();
			
			switch(i){
			case 1:
				System.out.print("���� �ΰ��� �Է��ϼ���");
				p.plus(x, y);
				break;
			case 2:
				System.out.print("���� �ΰ��� �Է��ϼ���");
				p.minus(x, y);
				break;
			case 3:
				System.out.print("���� �ΰ��� �Է��ϼ���");
				p.supply(x, y);
				System.out.println(x);
				break;
			case 4:
				System.out.print("���� �ΰ��� �Է��ϼ���");
				p.divide(x, y);
				break;
			case 5:
				System.out.print("�����մϴ�.");
				break;
			default:
				System.out.print("��ȿ�� ���ڰ� �ƴմϴ�.");
			}
			}while(i!=5);
		}
		void pr2(){
			System.out.println("���ڿ� �ΰ��� �Է��ϼ���");
			p.apeend(s1, s2);
		}
	}

