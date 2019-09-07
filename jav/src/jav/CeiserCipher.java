package jav;

import java.util.Scanner;

public class CeiserCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	String inp=sc.nextLine();
	String input=inp.toUpperCase();
	int key=sc.nextInt();
	System.out.println(encrypt(input,key));
	}
	public static String encrypt(String input,int key) {
		StringBuilder encrypted=new StringBuilder(input);
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ss="";
		//lengthy code 
		/*for(int i=0;i<encrypted.length();i++) {
		char ch=encrypted.charAt(i);
		for(int k=0;k<alphabet.length();k++) {
			char ap=alphabet.charAt(k);
		
			if(ch==ap) {
			int p=alphabet.indexOf(ap)+key;
			if(p<26) {
				ss=ss+alphabet.charAt(p);
			}
			else  {
				int n=p%26;
				ss=ss+alphabet.charAt(n);
			}
			}
			
		}
	}	*/
		//simple way implementation..
		String shiftedalp=alphabet.substring(key)+alphabet.substring(0,key);
		
		for(int i=0;i<encrypted.length();i++) {
			char cc=encrypted.charAt(i);
			int sf=alphabet.indexOf(cc);
			if(sf !=-1) {
			char sd=shiftedalp.charAt(sf);
			encrypted.setCharAt(i, sd);
			
		}
		}
		
		
		return encrypted.toString();
		
	}
	

}
