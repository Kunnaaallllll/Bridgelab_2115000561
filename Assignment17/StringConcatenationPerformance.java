public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int n = 1000000;
        String str = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();

        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder concatenation time: " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sf.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer concatenation time: " + (endTime - startTime) / 1000000 + " ms");
    }
}
