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
		
		String dna="cgateg";
		System.out.println(dna.indexOf("gat"));
		System.out.println(dna.substring(1,4));
		
		String su="dosomething";
		
		System.out.println(reverse(su));
		
		
	}
	public static String reverse(String su) {
		String sdk="";
		for(int k=0;k<su.length();k++) {
			sdk=su.charAt(k) +sdk;
			
		}
		return sdk;
		}

}
