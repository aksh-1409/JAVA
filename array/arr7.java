class arr7{
    public static void main(String[] args){
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {1,2,3,4,5};
            int sum=0;
        for(int i=0;i<5;i++){
            sum = sum + arr1[i];
        }
        int sum1=0;
        for(int j=0;j<5;j++){
            sum1 = sum1 + arr2[j];
        }

        System.out.println("The sum of the first array is: " + sum);
        System.out.println("The sum of the second array is: " + sum1);
    }
}