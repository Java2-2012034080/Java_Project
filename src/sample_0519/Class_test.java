package sample_0519;

public class Class_test {

		public static void main(String[] args){
		
		P_object[] pob = new P_object[3];
		pob[0] = new P_object();
		pob[1] = new C1();
		pob[2] = new C2();
		
		pr_all(pob[0]);
		pr_all(pob[1]);
		pr_all(pob[2]);
			
	}
	
	public static void pr_all(P_object temp){temp.pr();}
	public static void change_all(P_object temp, int x, int y){
		temp.change(x, y);
	}
}