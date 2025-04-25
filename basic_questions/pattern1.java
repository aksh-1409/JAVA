import java.util.Scanner;

class pattern1{
    public static void main(String []args){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();

        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*Enter the number of rows: 
5
* 
* * 
* * * 
* * * * 
* * * * * *

*/