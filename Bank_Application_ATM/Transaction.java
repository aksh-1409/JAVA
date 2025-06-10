class Transaction{

    private int balance;

    public static void deposit(int amount, Account x){
         balance = x.getBalance();
        balance += amount;
        x.setBalance(balance);
        x.getTransaction().add("Deposited amount :" + amount);
        System.out.println("Amount is being Deposited");
        System.out.println("Transaction Completed\n");
    }

    public static void withdraw(int amount, Account x){
         balance = x.getBalance();
        if(balance > amount)
        {
        balance -= amount;
        x.setBalance(balance);
        x.getTransaction().add("Withdraw amount :" + amount);
        System.out.println("Amount is being withdrawn");
        System.out.println("Transaction Completed\n");
        }
        else
        System.out.println("Insufficient Balance\n");
    }

    public static void checkBalance(Account x){
         balance = x.getBalance();
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    public static void printTransaction(Account x){
        if(x.getTransaction().isEmpty()){
            System.out.println("No Transcations Done yet\n");
        }else{
            for(String statement: x.getTransaction()){
                System.out.println(statement);
            }
            System.out.println();
        }
    }


}