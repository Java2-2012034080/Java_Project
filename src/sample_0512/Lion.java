package sample_0512;

public class Lion extends Animal {
	private int legs;
	
	public Lion(int legs) {
		super(100,"hansome");
		this.legs = 4;
	}
	void roar(){
		System.out.println("roar()가 호출되었음");
	}
	void infor(){
		System.out.println(weight+" "+picture);
	}

}
