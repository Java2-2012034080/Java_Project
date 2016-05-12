package sample_0428;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("s600","white",80);
		Car c2 = new Car("e500","blue",20);
		int n = Car.num;
		System.out.println("지금까지 생성된 자동차 수  = " + n);
		System.out.println(Car.returns());

	}

}
