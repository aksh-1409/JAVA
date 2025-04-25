class palindrome{

    public static void main(String[] args){

        String str = "madam";
        int i,j;
        for(i=0,j=str.length()-1;i<=j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("The string is not a palindrome");
                break;
            }
        }
        if(i>j){
            System.out.println("The string is a palindrome");
        }
    }
}\