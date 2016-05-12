package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television testTv = new Television();
		testTv.print();
		Television myTv= new Television(7,10,true);
		myTv.print();
		Television yourTv = new Television(11,20,true);
		yourTv.print();
		Television testTv2 = new Television(10,20);
		testTv2.print();
		
		
	}

}
