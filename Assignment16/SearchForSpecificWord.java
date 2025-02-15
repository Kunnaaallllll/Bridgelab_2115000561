import java.util.*;
public class SearchForSpecificWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array : ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter your string in array : ");
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("enter the word that you want to search in the sentence : ");
        String str=sc.next();
        SearchForSpecificWord obj = new SearchForSpecificWord();
        obj.searchWord(arr, str);
    }
    public void searchWord(String arr[],String str){
        for(int i=0;i<arr.length;i++){
            String sentence = arr[i];
            if(sentence.contains(str)){
                System.out.println(sentence);
                return;
            }
        }
        System.out.println("Not Found");
    }
}