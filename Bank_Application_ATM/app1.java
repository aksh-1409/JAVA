import  java.util.Scanner;
import java.util.ArrayList;

class app{

    public static void main(String[] args){
        

        ArrayList<Account> accounts= new ArrayList<>();
        System.out.println("Welcome User");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Account account1 = new Account(name);

        System.out.println("!!!!!!!!!!!!!!Congratulations!!!!!!!!!! ");
        System.out.println("Your Account is being Created");
        System.out.println("Your Account Number " + account1.getAccountNumber());
        
        int choice;

        do{
            System.out.println("Select an Option to proceed:");
            System.out.println("Press 1 to Create Account");
            System.out.println("Press 2 to Deposit");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to Check Balance");
            System.out.println("Press 5 to View Transcations");
            System.out.println("Press 6 to Exit:");
            System.out.print("Press Option: ");

             choice = sc.nextInt();

                switch(choice){
                    case 1:
                        {
                            System.out.println("Enter a name to create account:");
                            String name = sc.nextLine();
                            Account newUser = new Account(name);
                            accounts.add(newUser);
                            System.out.println("Your account number is " + get);
                            break;
                        }



                    case 2:
                        {
                            System.out.println("Enter Amount to be deposit:");
                            int amount = sc.nextInt();
                            Transaction.deposit(amount, account1);
                            break;
                        }

                    case 3:
                        {
                            System.out.println("Enter Amount to be withdrawn:");
                            int amount = sc.nextInt();
                            Transaction.withdraw(amount, account1);
                            break;
                        } 

                    case 4:
                        {
                            Transaction.checkBalance(account1);
                            break;
                        }   

                    case 5:
                        {
                            Transaction.printTransaction(account1);
                            break;
                        }
                    
                    case 6:
                        {
                            System.out.println("Exiting... Thank you");
                            break;
                        }

                    default : 
                    {
                    System.out.println("Invalid Input...");
                    System.out.println("Please Retry....\n");
                    }
                }
             }while(choice!=6);

             sc.close();
    }
}