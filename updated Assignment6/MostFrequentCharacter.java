import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        char mostFrequent = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        int[] count = new int[256];
        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            count[ch]++;
            if (count[ch] > maxCount) {
                maxCount = count[ch];
                maxChar = ch;
            }
        }
        return maxChar;
    }
}
