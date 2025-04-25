import java.util.Scanner;

class switch_case_calc{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /,%): ");
        char operator = sc.next().charAt(0);

        double result;

        switch(operator){
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = (double) a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if(b!=0){
                    result = a % b;
                    System.out.println("Result: " + result);
                }
                else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, / or %.");  
        }

        sc.close();
    }
}