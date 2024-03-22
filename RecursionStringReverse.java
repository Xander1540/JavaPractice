import java.util.Scanner;

public class RecursionStringReverse {
    
    public static void printReverse(String s, int i){

        if(i==0){
            System.out.print(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        printReverse(s, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = s.length()-1;
        printReverse(s, i);
        
    }
}
