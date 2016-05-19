package sample_0519;

public class P_object {
	
	int o_x, o_y;

	public P_object(){ o_x =0; o_y=99;}
	
	public P_object(int o_x, int o_y){
		
		super();
		this.o_x=o_x;
		this.o_y=o_y;
	}
	
	public void pr(){System.out.println("x= "+o_x+" y= "+o_y);}
	public void change(int x, int y){this.o_x=x; this.o_y=y;}

	

}
