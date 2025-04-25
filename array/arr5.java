import java.util.Scanner;

class arr5{

    public static void main(String[] args){

        

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0,j=size-1;i<size;i++,j--){
           if(i<=j){
                System.out.println(arr[i]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
        else if(i>j)
        { 
            break;
        }
    }

     System.out.println("The elements of the array are: ");
        for(int i=0;i<size;i++){
              System.out.println(arr[i]);
        }

}
}
