import java.util.Scanner;


class ques3{

public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        naturalno(limit);
       

}

public static void naturalno(int limit){
        for(int i=limit; i>=1;i--){
            System.out.print(i + " ");
        }
        
        }
 
}