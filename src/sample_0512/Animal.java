package sample_0512;

public class Animal {
	protected double weight;
	protected String picture;
	
	public Animal(){
		weight = 99;
		picture = "animal";
		System.out.println("animal cont");
	}
	
	public Animal(double w, String pic){
		weight=w;
		picture=pic;
		System.out.println("Animal cont2");
	}
	
	void eat(){
		System.out.println("eat()�� ȣ��Ǿ���");
	}
	
	void sleep(){
		System.out.println("sleep()�� ȣ��Ǿ���");
	}
	
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}



}
