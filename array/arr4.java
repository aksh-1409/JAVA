import java.util.Scanner;

class arr4{

    public static void main(String[] args){

        

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("The sum of the array are: ");
        for(int i=0,sum=0;i<size;i++){
            
        }
    }

}