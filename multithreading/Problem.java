class Account extends Thread {
    
  private static int  balance = 1000;
  private int amount ;      
       
        public Account(int amount){
            this.amount = amount;
        }

        public void run(){
            
                if(balance>amount){
                    System.out.println("Amount Withdraw " + amount);
                    balance -= amount;
                }
                else{
                    System.out.println("gareeb");
                }
                
            }
        

}


class Problem {
    public static void main(String[] args){
        Account a = new Account(800);

        Account b = new Account(800);

        a.start();
        b.start();
    }
}