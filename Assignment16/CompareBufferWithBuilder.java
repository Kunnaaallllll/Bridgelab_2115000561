import java.util.*;

class CompareBufferWithBuilder{
	public static void main(String[]args){
		int times = 1000000;
		String text = "Hello";
		
		long startSTBu = System.nanoTime();
		StringBuffer stbu = new StringBuffer();
        for (int i = 0; i < times; i++) {
            stbu.append(text);
        }
        long endSTBu = System.nanoTime();
		
		long startSTB = System.nanoTime();
		StringBuilder stb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            stb.append(text);
        }
        long endSTB = System.nanoTime();
		
        System.out.println("String Buffer Time: "+(endSTBu - startSTBu));
        System.out.println("String Builder Time: "+(endSTB - startSTB));
	}
}