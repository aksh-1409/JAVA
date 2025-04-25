import java.util.Scanner;


class greatestNo{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("The greatest number is: " + a);
        }
        else if(b>a){
            System.out.println("The greatest number is: " + b);
        }
        else{
            System.out.println("Both numbers are equal.");
        }
    }
}