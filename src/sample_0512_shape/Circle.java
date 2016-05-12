package sample_0512_shape;

public class Circle extends Shape{
	
	private int r;
	
	public Circle(int r){
		this.r=r;
	}
	
	public void move(int _x, int _y){
		
		x = _x+r;
		y = _y+r;
		
	}
	public void info(){
		System.out.println(x+" Circle "+y);
	}
	
	public void iii(){
		System.out.println(r);
	}

}
