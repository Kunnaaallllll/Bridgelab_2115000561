import java.util.Scanner;

class RemoveDuplicates {
    static String removeDuplicateChars(String word) {
        String result = "";
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        System.out.println("Modified String: " + removeDuplicateChars(word));
        
        sc.close();
    }
}
