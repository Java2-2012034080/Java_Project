package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<8;i++){
			for(int j=1;j<7;j++){
				if((i>2 && i<6)&&(j>3&&j<6)){continue;}
				if(i==7&&j>3&&j<6){
					System.out.print("    ");
					continue;}
				System.out.print(j+"0"+i+" ");
				if(i<3 && j==4){break;}
				
			}
			System.out.println("");
		}

	}

}
