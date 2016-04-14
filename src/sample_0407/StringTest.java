package sample_0407;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String proverb = "A barking dog.";
		String s1, s2,s3, s4;
		
		System.out.println("문자열의 길이 =" + proverb.length());
		
		s1 = proverb.concat("Never Bite!");
		s2 = proverb.replace ('b','B');
		s3 = proverb.substring(2, 5);
		s4 = proverb.toUpperCase();
		
		System.out.println(s1); // A barking dog. Never bite!
		System.out.println(s2); // A Barking dog.
		System.out.println(s3); // bar
		System.out.println(s4); // A BARKING DOG.
		
		System.out.println(proverb.charAt(2)); // b
		
	}

}
