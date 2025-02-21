import java.io.*;

class ReadLargeFile{
	public static void main(String[]args){
		String path = "readFile.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String l;
			while((l = br.readLine()) != null){
				if(l.toLowerCase().contains("error"))
					System.out.println(l);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}