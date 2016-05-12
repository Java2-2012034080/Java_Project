package sample_0512_shape;

public class Shapetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Shape r1 = new Rectangle();
		Shape c1 = new Circle(4);
		
		r1.move(10, 20);
		c1.move(1, 2);
		Infor(r1);
		Infor(c1);
		Inforrr(c1);
		Inforrr(r1);
		
		r1.info();
		c1.info();
	}

	static void Infor(Shape r){r.info();}
	static void Inforr(Rectangle r){r.info();}
	static void Inforrr(Shape r){r.iii();}
	
}
