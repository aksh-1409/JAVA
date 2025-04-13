import java.util.Scanner;


class typeCast{
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the float number : ");
       
        float f = sc.nextFloat();

        int a= (int)f;
        System.out.println("The float number is : " + f);

        System.out.println("The int number is : " + a);


    }
}