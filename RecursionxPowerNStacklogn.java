import java.util.Scanner;

public class RecursionxPowerNStacklogn {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new  Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.print(ans);
    }

    private static int power(int x, int n) {
    
        if (n==0) {
            return 1;
        }
        if (n==1) {
            return x;
        }
        if (x==0) {
            return 0;
        }

        if (n%2==0) {
            return power(x, n/2) * power(x, n/2);
        }
        else{
            return power(x, n/2) * power(x, n/2) * x;
        }
    }
}
