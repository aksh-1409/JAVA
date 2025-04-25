import java.util.Scanner;

class sum1{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

      //  System.out.println("Enter the number to sum: ");

        int n = 123;

        int rev = 0;

        while(n!=0){
            int digit = n%10;
            
           if(digit %2==0){
            System.out.println("even");
           }
           else{
            System.out.println("odd");
           }

           n = n / 10;
        }
        

    }
}