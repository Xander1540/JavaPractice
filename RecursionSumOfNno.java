import java.util.Scanner;

public class RecursionSumOfNno {
    
    public static int  printSum(int i, int n, int sum) {
        if(i==n){
            
            return 0;
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
        System.out.println(printSum(i, n, sum));
    }
}
