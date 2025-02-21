import java.io.*;


class ReadWriteTextFile{
	public static void readAndwriteFunc(String readFilePath, String writeFilePath){
		try{
			FileInputStream fis = new FileInputStream(readFilePath);
			FileOutputStream fos = new FileOutputStream(writeFilePath);
			byte[] arr = new byte[1024];
			int n;
			while((n = fis.read(arr)) != -1){
				fos.write(arr,0,n);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[]args){
		readAndwriteFunc("readFile.txt","writeFile.txt");
		System.out.println("Done");
	}
}