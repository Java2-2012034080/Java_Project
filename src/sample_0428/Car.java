package sample_0428;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int num=0;
	
	public Car(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		id = ++num;
	}
	
	public static int returns(){
		return num;
	}
}
