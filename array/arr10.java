class arr10{

    public static void main(String[] args){

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println("The common element is: " + arr1[i]);
                    count++;
                }
                
            }
        }

        if(count == 0){
            System.out.println("There are no common elements in the two arrays.");
        }
    }
}