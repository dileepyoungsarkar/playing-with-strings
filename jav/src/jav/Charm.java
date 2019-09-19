package jav;

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

public class Charm {
	
	class InvalidFileException extends Exception{
		private static final long serialVersionUID =1L;
		public InvalidFileException (String messge){
			super(message);
		}
		public InvalidException(Throwable throwable){
			super(throwable);
		}
		public InvalidException(String messge,Throwable throwable){
			super(meassage,throwable);
		}
	}
	public static String calculateBonus(int basicpay){
		int bp=basicpay*2;
		return (Integer.toString(bp));
	}
	
	public void processFile(String inFile, String outFile) throws InvalidFileException, IOException {
		
		String newLines="\n";
		String bonusPay="";
		BufferedReader reader=null;
		File file=new File(inFile);
		if(file.exists()){
			//For debugging
			System.out.println("Writing to file: " + outFile);
			System.out.println("============================================");
	    FileReader filereader =new FileReader(file);
		reader=new BufferedReader(file);
		
		BufferedWriter writer=new BufferedWriter(new FileWriter(outFile));
		
		String line;
		while((line=reader.readLine()) !=null){
			String[] values=line.split(",");
			System.out.println(values[0].toString() + "," + values[1].toString() + "," + values[2].toString() + "," + values[3].toString() + "," + calcBonus(Integer.parseInt(values[3].toString())));
			writer.write(values[0].toString() + "," + values[1].toString() + "," + values[2].toString() + "," + values[3].toString() + "," + calcBonus(Integer.parseInt(values[3].toString())) + "\n");
		}
		//remember to close the input and output files
		reader.close();		
		writer.close();
		}
		else{
			throw new InvalidFileException("File not found exception");
		}
	}

	public static void main(String[] args) {
		EmployeeBonus myObj =new EmployeeBonus();
		try{
			myObj.processFile("src/employee_base.csv", "src/employee_base_plusBonus.csv");
		}
		catch(InvalidFileException e){
			e.printStackTrace();}
		catch(IOException e){
			e.printStackTrace();}
		
	
	}

}
