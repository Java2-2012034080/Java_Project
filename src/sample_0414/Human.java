package sample_0414;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		
		c1.setman(4);
		c1.getman();
		c1.allsetting(4, "red");
		
		c1.pr();
		
		Car c2 = new Car(5,7,"blue");
		
		c2.pr();
		
		Car c3 = new Car();
		c3.pr();
	}

}
