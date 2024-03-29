import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array:");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
