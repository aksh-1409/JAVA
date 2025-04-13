import java.util.Scanner;

class Hello{
    public static void main(String [] args){
//        int a = 5;
     /*   switch(a){
            case  1:
            case  2:
            case  3:
            case  4:

                System.out.println("hello");
                break;

            case 5 :
                System.out.println("hi");
                break;
                default:
                System.out.println("default case");
       }
       */

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between 1 and 7: ");
    int day = sc.nextInt();

    switch(day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
    }

    


    }
}