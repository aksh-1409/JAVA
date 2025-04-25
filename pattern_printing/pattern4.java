class pattern4{
    public static void main(String [] args){

        for(int i=1;i<=5;i++){
            for(int K =1;K<=5-i;K++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }

    }
}