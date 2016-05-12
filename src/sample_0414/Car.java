package sample_0414;

public class Car {
//
	private int man;
	private int tire;
	private String color;
	
	public void setman(int man){
		this.man = man;
	}
	public int getman(){
		return man;
	}
	
	public void allsetting(int tire, String color){
		this.tire=tire;
		this.color=color;
		
	}
	
	public Car(int man, int tire, String color){
		this.man = man;
		this.tire=tire;
		this.color=color;
	}
	
	public Car(){
		this(0,0,"white");
	}
	
	
	void pr(){
		System.out.println("man : " +man+ "  tire : "+tire+"  color : "+color);
	}
}
