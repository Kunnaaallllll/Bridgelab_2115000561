import java.io.*;

class EfficientFileCopy{
    private static final int size = 4096;
    
    public static void copyBuffered(String path, String path2) {
        long startTime = System.nanoTime();
        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2))) {
            
            byte[] arr = new byte[size];
            int b;
            
            while ((b = bis.read(arr)) != -1) {
                bos.write(arr, 0, b);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        long endTime = System.nanoTime();
        System.out.println("Buffered Stream Time: " + (endTime - startTime) / 1e6 + " ms");
    }
    
    public static void copyUnbuffered(String path, String path2) {
        long startTime = System.nanoTime();
        
        try (FileInputStream fis = new FileInputStream(path);
             FileOutputStream fos = new FileOutputStream(path2)) {
            
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        long endTime = System.nanoTime();
        System.out.println("Unbuffered Stream Time: " + (endTime - startTime) / 1e6 + " ms");
    }

    public static void main(String[] args) {
        String path = "readFile.txt";
        String bufferedPath = "bufferedCopy.txt";
        String unbufferedPath = "unbufferedCopy.txt";

        copyBuffered(path, bufferedPath);
        copyUnbuffered(path, unbufferedPath);
    }
}
