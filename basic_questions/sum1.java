import java.util.Scanner;

class sum1{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number to sum: ");

        int n = sc.nextInt();

        int rev = 0;

        while(n!=0){
            int digit = n%10;
            rev = rev+ digit;
            n = n/10;
        }
        System.out.println("The sum of the number is: " + rev);

    }
}