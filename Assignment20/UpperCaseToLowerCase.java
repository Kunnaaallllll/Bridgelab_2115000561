import java.io.*;

class UpperCaseToLowerCase{
	public static void main(String[]args){
		String readFile = "readFile.txt";
		String writeFile = "WriteFile.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(readFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile))){
			
			String l;
			while((l = br.readLine()) != null){
				bw.write(l.toLowerCase());
				bw.newLine();
			}
			
			System.out.println("Done");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}