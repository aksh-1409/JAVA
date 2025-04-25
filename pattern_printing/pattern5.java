/*


* * * *
 * * *
   *


   */

class pattern5{
    public static void main(String [] args){

        for(int i=1;i<=5;i++){
            for(int K =1;K<i;K++){
                System.out.print("  ");
            }
            for(int j=5;j>=i*2-1;j--){
                System.out.print("* ");
            }
            
            System.out.println();
        }

    }
}