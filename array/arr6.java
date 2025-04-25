import java.util.Scanner;

class arr6{

    public static void main(String[] args){

        

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = in.nextInt();

    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i] + arr[j] == target){
                System.out.println("The elements are: " + arr[i] + " and " + arr[j]);

            }
        }
    }

   /*  System.out.println("The elements of the array are: ");
        for(int i=0;i<size;i++){
              System.out.println(arr[i]);
        }*/

}
}