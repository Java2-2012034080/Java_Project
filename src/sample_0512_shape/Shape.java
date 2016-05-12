package sample_0512_shape;

abstract class Shape {

	protected int x, y;
	
	public Shape(){
		x=0;
		y=0;
	}
	
	public Shape(int _x, int _y){
		x=_x;
		y=_y;
	}
	

	public abstract void info();
	public abstract void move(int _x, int _y);/*{
		this.x= _x;
		y+=_y;
	}*/
	public abstract void iii();
}
