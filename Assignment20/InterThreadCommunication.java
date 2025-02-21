import java.io.*;

class InterThreadCommunication{
	public static void main(String[]args) throws Exception{
		PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
		
		Thread writer = new Thread(() -> {
            try {
                pos.write("Writer".getBytes());
                pos.close();
            } 
			catch(Exception e) {
                System.out.println(e);
            }
        });
		
		Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
                pis.close();
            } 
			catch (Exception e) {
                System.out.println(e);
            }
        });
		
		
		writer.start();
        reader.start();
        
        writer.join();
        reader.join();
	}
}