class linearsearch{


    public static int linearsearch(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        
        }
        return -1;
    }




    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=5;
        
        int  key;
        key =  linearsearch(arr,target);

        if(key==-1){
            System.out.println(target +" not found in the array");
        }else{
            System.out.println( target + " found at index: " + key);
        }

    }
}