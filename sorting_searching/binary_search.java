class binarySearch{

   public  static void bubbleSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }


    public static void main(String[] args){
        int arr[] = {5, 1, 4, 2, 8};
     
        
        bubbleSort(arr);
       
       int result;
       result = binarySearch(arr, 4);

         if(result==-1){
              System.out.println("Element not found in the array");
         }
              
              else{
                  System.out.println("Element found at index: " + result);
              }
    }


  public  static int binarySearch(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
               
                return mid;
            }
            else if(arr[mid]>target){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return -1;
    }



}