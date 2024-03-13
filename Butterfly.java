public class Butterfly {
    
    public static void main(String[] args) {
    
        int n=8;

        System.out.println();
        System.out.println();
        System.out.println();
            for(int i=0; i<=n; i++){
                
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                int spaces = 2*(n-i);
                for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                }


                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }
    
            for(int i=n; i>=0; i--){
                
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                int spaces = 2*(n-i);
                for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                }


                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }
    }
}
