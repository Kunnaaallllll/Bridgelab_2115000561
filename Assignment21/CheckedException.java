import java.io.*;

class CheckedException{
	public static void main(String[]args){
		String path = "data.txt";
		try(FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr)){
				String l;
				while((l = br.readLine()) != null){
					System.out.println(l);
				}
			}
		catch(IOException e){
			System.out.println("File Not Found.");
		}
	}
}