package test;
import java.util.*;
public class Signtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sign signal = new Sign();
		Scanner input = new Scanner(System.in);
		
		System.out.println("전광판에 입력할 문구를 적으세요.");
		signal.text = input.nextLine();
	
	}

}
