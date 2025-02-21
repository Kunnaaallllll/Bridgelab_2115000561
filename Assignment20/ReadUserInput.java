import java.io.*;

class ReadUserInput{
	public static void main(String[]args){
		String writeFilePath = "writeFile.txt";
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter(writeFilePath,true)){
				String name = br.readLine();
				String age = br.readLine();
				String lang = br.readLine();
				
				fw.write("Name: "+name+" Age: "+age+" Language: "+lang);
				System.out.println("Done");
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
}