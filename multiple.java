import java.util.Scanner;

class multiple{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check multiple of 3 or not : ");
        int n = sc.nextInt();


        if(n%3==0){
            System.out.println("The number is multiple of 3.");
        }
        else{
            System.out.println("The number is not multiple of 3.");
        }

   }
}