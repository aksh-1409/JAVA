import java.util.Random;
import java.util.ArrayList;

class Account{
   private String user_name;
   private int accountNumber;
   private int balance;
   private ArrayList<String> transactions;

     Account(String user_name){
        this.user_name = user_name;
        this.balance = 0;
        this.transactions = new ArrayList<>();
        setAccountNumber();
    }


   public void setAccountNumber(){
   Random rand = new Random();
        

    this.accountNumber = 10000 +  rand.nextInt(90000);
    }

   
    public String getName(){
        return user_name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount){
        balance = amount;
    }

    public ArrayList<String> getTransaction(){
        return transactions;
    }
}