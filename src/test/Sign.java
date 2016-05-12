package test;

public class Sign {

	
	String text;
	
	void print(){
		while(true){
			for(int j=0; j<text.length(); j++)
				System.out.println(text.substring(j, j+1)+" ");
		}

	}
}
