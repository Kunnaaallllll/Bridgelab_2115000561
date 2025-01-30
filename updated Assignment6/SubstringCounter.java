import java.util.Scanner;

class SubstringCounter {
    static int countOccurrences(String mainText, String subText) {
        int count = 0;
        int index = 0;

        while ((index = mainText.indexOf(subText, index)) != -1) {
            count++;
            index += subText.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main text: ");
        String mainText = sc.nextLine();
        
        System.out.print("Enter the substring: ");
        String subText = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(mainText, subText));

        sc.close();
    }
}
