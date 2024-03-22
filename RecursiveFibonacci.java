import java.util.Scanner;

public class RecursiveFibonacci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;

        System.out.print(0+" ");
        System.out.print(1+" ");

        fibonacci(a, b, n-2);
    }

    private static void fibonacci(int a, int b, int n) {
        int f =0;
        if(n==0){
            return;
        }
        f = a+b;
        System.out.print(f+" ");
        fibonacci(b, f, n-1);
    }
}
