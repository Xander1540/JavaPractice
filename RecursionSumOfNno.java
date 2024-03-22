import java.util.Scanner;

public class RecursionSumOfNno {
    
    public static void  printSum(int i, int n, int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int sum=0;
        printSum(i, n, sum);
    }
}
