package jav;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String encr = alphabet.substring(23);
		System.out.println(encr);
		encr = encr + alphabet.substring(0, 23);
		System.out.println(encr);
		String s="Start";
		s=s.substring(0,4)+"le"+s.substring(4);
		
		System.out.println(s);
	}

}
