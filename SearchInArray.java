import java.util.Scanner;

public class SearchInArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }

        for(int i=0; i<n; i++){
            if(arr[i]== target){
                System.out.print("\'"+target+"\'"+" is at "+i+"th position.");
            }
        }
    }
}
