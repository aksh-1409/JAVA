class Account extends Thread {
    
  private static int  balance = 1000;
  private int amount ;      
       
        public Account(int amount){
            this.amount = amount;
        }

        public void run(){
            synchronized(Account.class){
                
                if(balance>amount){
                    System.out.println("Amount Withdraw " + amount);
                    balance -= amount;
                    System.out.println("Available balance " + balance);
                }
                else{
                    //   balance -= amount;
                    //   System.out.println("Amount Withdraw " + amount);
                    //   System.out.println("Available Balance " + balance);
                    System.out.println("gareeb");
                }
            }
            }
        

}


class Solution{
    public static void main(String[] args){
        Account a = new Account(800);

        Account b = new Account(800);

        a.start();
        b.start();
    }
}