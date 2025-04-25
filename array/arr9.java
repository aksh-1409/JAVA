class arr9{
    public static void main(String[] args){
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {1,2,3,4,5};
        int [] arr3 = new int[10];

        for(int i=0,k=0;i<5;i++,k++){
           arr3[k] = arr1[i];
        }
        for(int j=0,k=5;j<5;j++,k++){
            arr3[k] = arr2[j];
        }
        System.out.println("The merge of the two arrays is: ");
        for(int i=0;i<10;i++){
            System.out.println(arr3[i]);
        }
    }
}