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

public String[] getCommon(){
	FileResource resource =new FileResource("data/common.txt");
	String[] common=new String[20];
	int index=0;
	for(String s:resource.words()){
		common[index]=s;
		index +=1;
	}retrun common;
}

public int indexof(String[] list,String word){
	for(int k=0;k<list.lenght;k++){
		if(list[k].equals(word)){
			return k;
		}
	}
	return -1;
}
public void countwords(FileResource resource,String[] common,int[] counts){
	for(String word :resource.words()){
		word=word.toLowerCase();
		int index=indexOf(common,word);
		if(index !=-1){
			counts[index]+=1;
		}
	}
}

void countShakespeare(){
	String[] plays={"caesar.txt","errors.txt"};
	String[] common=getCommon();
	int[]  counts=new int[common.length];
	for(int k=0;k<plays.lenth;k++){
		FileResource resource =new FileResource("data/"+play[k]);
		countWords(resource,common,counts);
		System.out.println(paly[k]);
	}
	
	for(int k=0;k<common.lenght;k++){
		System.out.println(common[k +"\t"+counts[k]]);
	}
}






















/**
 * Create a comma separate file "employee_base.csv" that holds employee records 
 * in the following format
 *  <<EmpID>>,<<EmpName>>,<<Dept_No>>,<<Basic_Pay>>
 *  
 * with the folllowing data
 *    1,Hugo,123,2000
 *    2,Chris,123,2500
 *    3,Jason,234,2100
 *    4,Marie,234,2200
 *    
 * In the class below, create a static function "calculateBonus" that 
 *   - reads all employee records, 
 *   - calculate bonus (200% of basic pay) and 
 *   - store the result data in another file "employe_bonus.csv" in the following format
 *     <<EmpID>>,<<Basic_Pay>>,<<Bonus>>
 *   
 * Finally, run the function to create the "employe_bonus.ccsv" file 
 * 
 * @author Cognizant
 * @version 1
 */
public class EmployeeBonus {

	
	public static void main(String[] args) {
		int a[]=new int[4]
		for(int i=0;i<4;i++){
			
			EmployeeBonus ab[i]=new EmployeeBonus	
		}
		
	}
	public static double calculateBonus( int bonus){
		double ss=bonus*2;
		return ss;
		
	}
}



public class EmployeeBonus {
	
	class InvalidFileException extends Exception {
		private static final long serialVersionUID = 1L;
		
		public InvalidFileException(String message) {
			super(message);
		}
		
		public InvalidFileException(Throwable throwable){
			super(throwable);
		}
		public InvalidFileException(String message, Throwable throwable){
			super(message, throwable);
		}
	}	
	
	public String calcBonus(int basePay)
	{ 		
		int bonus = 0;
		bonus = basePay * 2;
		//System.out.println("Bonus Pay: " + String.valueOf(bonus));

		return Integer.toString(bonus); //String.valueOf(bonus);
	}

	public void processFile(String inFile, String outFile) throws InvalidFileException, IOException {
		
		//This function may throw two exceptions.  BufferedReader, and BufferedWriter may throw IOExceptions
		//If the file is not found, we will throw an InvalidFileException
		//No exception handling is done here - the calling program will handle the exceptions

		String newLines = "\n";
		String bonusPay = "";
	    BufferedReader reader = null;
		File file= new File(inFile);	
		
		if(file.exists()){
			//For debugging
			System.out.println("Writing to file: " + outFile);
			System.out.println("============================================");
			
			FileReader filereader=new FileReader(file);
			reader = new BufferedReader(filereader);	
	
				
			//Create the output file
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
			
			String line;	
			//Read each line of the input file

			while ((line = reader.readLine()) != null) {
				//split input line into arrays so we can extract the pay field
				String[] values = line.split(",");	
				//pay field is the 3rd index in the array; compute the pay and write the new line back to the output file
				System.out.println(values[0].toString() + "," + values[1].toString() + "," + values[2].toString() + "," + values[3].toString() + "," + calcBonus(Integer.parseInt(values[3].toString())));
				writer.write(values[0].toString() + "," + values[1].toString() + "," + values[2].toString() + "," + values[3].toString() + "," + calcBonus(Integer.parseInt(values[3].toString())) + "\n");
			}
			//remember to close the input and output files
			reader.close();		
			writer.close();
			
		
		} else {
			// File is not found - throw our custom exception
			throw new InvalidFileException("File not found exception");				
		}			

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBonus myObj = new EmployeeBonus();	
		
		// processFile throws either InvalidFileException or IOExceptions back to us
		// put our call to processFile within try/catch blocks to catch these exceptions
		// This first block will process properly with no exceptions
		try {
			myObj.processFile("src/employee_base.csv", "src/employee_base_plusBonus.csv");
		} catch (InvalidFileException e){
			//Our custom exception thrown from processFile function
			e.printStackTrace();
		} catch (IOException e){
			//Standard IOException thrown from BufferedReader/BufferedWriter ops
			e.printStackTrace();
		}
		
		// now enter a bad filename to test our exceptions
		// We should get an InvalidFileException: File not found exception
		try {
			myObj.processFile("src/employee_bad_file.csv",  "src/badFileOutput.csv");
		} catch (InvalidFileException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
