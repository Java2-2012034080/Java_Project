package sample_0428;

public class Method1 {
	public static void main(String args[]){
		
	int [] list = {1,2,3,4,5};
	Method2 m1= new Method2();
	
	m1.m2(list
			);
	
	for(int i=0; i<list.length; i++){
		System.out.print(list[i] + " ");
	}
	
	
	}
}
