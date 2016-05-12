package sample_0414;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob = new Account();
		ob.setName("Tom");
		ob.setBalance(10000000);
		System.out.println("이름은 "+ob.getName()+" 통장 잔고는"+ob.getBalance()+"입니다.");
	}

}
