

class Spiralprint{
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       
        

        printSpiral(arr);
    }


    static void printSpiral(int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(i==0){
                for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            }
            if(i!=0 && i<arr.length){
                int j = arr[i].length -1;
                System.out.println(arr[i][j]);
            }

            if(i==arr.length -1){
                
            }
            
        }
    }
}