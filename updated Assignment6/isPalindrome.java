import java.util.Scanner;

class PalindromeCheck {
    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        
        sc.close();
    }
}
