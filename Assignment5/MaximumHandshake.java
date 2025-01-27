import java.util.Scanner;
public class MaximumHandshake{
    public int handShakes(int n){//here we have used a method to perform this operation
    int totalCombination= (n * (n - 1)) / 2;
    return totalCombination;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int numOfStudent=sc.nextInt();
        MaximumHandshake mh=new MaximumHandshake();
        System.out.print("total handshakes combinations are : ");
        int totalCombination= (n * (n - 1)) / 2;//this is calculated directlty witghou any method
        int k=mh.handShakes(numOfStudent);
        
    }
}