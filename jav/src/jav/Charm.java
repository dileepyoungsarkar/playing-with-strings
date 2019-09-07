package jav;

public class Charm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="ABCabc01234;#!";
		for(int k=0;k<test.length();k++) {
		char ch=test.charAt(k);
				if(Character.isDigit(ch)){
					System.out.println(ch+" is digit");
					
			
		}
				if(Character.isAlphabetic(ch)) {
					System.out.println(ch);
				}
				if(ch=='#') {
					System.out.println(ch);
				}
				
		
		}

	}

}
