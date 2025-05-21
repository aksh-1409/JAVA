import java.util.Scanner;


class ques2{

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start limit: ");
        int start = sc.nextInt();
        System.out.println("Enter the end limit: ");
        int end = sc.nextInt();

        print_even(start,end);
    }


   public static void print_even(int start, int end){
        for(int i=start; i<=end;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        
        }
    }

