public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        String str = "hello";
        int times = 1000000;

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbf.append(str);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");
    }
}
