import java.util.Scanner;

public class RecursionNumbersPrint {

    public static void printNum(int n) {
        
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNum(n);
    }
}
