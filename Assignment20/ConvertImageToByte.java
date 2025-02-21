import java.io.*;

class ConvertImageToByte {
    public static byte[] read(String path) throws Exception {
        try (FileInputStream fis = new FileInputStream(path);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
             
            byte[] arr = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(arr)) != -1) {
                baos.write(arr, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    public static void write(String path, byte[] data) throws Exception {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(path)) {

            byte[] arr = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(arr)) != -1) {
                fos.write(arr, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String readImage = "Image.jpeg";
        String writeImage = "Output.jpeg";

        try {
            byte[] arr = read(readImage);
            write(writeImage, arr);
            System.out.println(writeImage);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
