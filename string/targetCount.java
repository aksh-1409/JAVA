class targetCount{

    public static void main(String[] args){
        String str = "racecar";
        char target = 'r';
    int count=0;
        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if( arr[i] == target){
                count++;
            }
        }
     System.out.println("The number of times the " + target + " character appears is: " + count);

     }

}