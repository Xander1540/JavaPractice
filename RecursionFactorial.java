import java.util.Scanner;

public class RecursionFactorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int fac=1;
        factorial(i, n, fac);
    }

    private static void factorial(int i, int n, int fac) {
        if(i==n || n==0){
            fac*=i;
            System.out.println(fac);
            return;
        }
        
        fac*=i;
        factorial(i+1, n, fac);
    }
}
