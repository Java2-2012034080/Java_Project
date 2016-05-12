package sample_0512_shape;

public class Rectangle extends Shape{

	
	private int x1,y1;
	
	
	
	public void move(int _x, int _y){
		x = x1+_x;
		y = y1+ _y;
	}
	
	public void info(){
		System.out.println(x+" Rectangle "+y);
	}
	public void iii(){
		System.out.println(x1+" "+y1);
	}
}
