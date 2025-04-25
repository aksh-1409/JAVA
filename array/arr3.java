import java.util.Scanner;

class arr3{

    public static void main(String[] args){

        

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}