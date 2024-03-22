import java.util.Scanner;

public class FirstLastOccurenceOfN {

    public static int first = -1;
    public static int last = -1;

    public static void Ocuurence(String str, char s, int i){
        if(i==str.length()){
            System.out.println("First "+first);
            System.out.println("Last "+last);
            return;
        }
        char currentChar = str.charAt(i);
        if (currentChar == s) {
            if(first ==-1){
                first = i;
            }else{
                last = i;
            }
        }

        Ocuurence(str, s, i+1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the element you want to search: ");
        char s = sc.next().charAt(0);
        int i=0;
        Ocuurence(str, s, i);
    }
}
