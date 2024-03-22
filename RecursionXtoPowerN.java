import java.util.Scanner;

public class RecursionXtoPowerN {
    
    public static void main(String[] args) {
        
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

        int xPowerNm1  = power(x, n-1);
        int  xPown = x*xPowerNm1; 
        return xPown;
    }
}
