/************************************
 Matthew Whalley
 Lab #3
 September 28, 2016
 *************************************/

public class Account{
    /* Constructors */
    public Account(){
        setAcctNo(0);
        setOwner("");
        setBalance(0.0);
    }

    public Account(int newAcctNo, String newOwner, double newBalance){
        setAcctNo(newAcctNo);
        setOwner(newOwner);
        setBalance(newBalance);
    }

    /* Properties */
    private int acctNo;
    private String owner;
    private double balance;

    /* Behaviors */
    public void setAcctNo(int acctNum){
        acctNo = acctNum;
    }
    public int getAcctNo(){
        return acctNo;
    }
    public void setOwner(String own){
        owner = own;
    }
    public String getOwner(){
        return owner;
    }
    public void setBalance(double bal){
        balance = bal;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double d){
        balance = balance + d;
    }
    public void withdraw(double w) throws InsufficientFunds{
        if(balance > w){
         balance = balance - w;
        }
        else{
         throw new InsufficientFunds();
        }
        
                
    }

    public void display(){
        System.out.println("Account Number:\t" + getAcctNo());
        System.out.println("Account Owner:\t" + getOwner());
        System.out.println("Balance:\t$" + getBalance());
        System.out.println();
    }

    public static void main(String[] args){
        Account a1;
        a1 = new Account(2222, "Frank", 500);
        a1.deposit(100.00);
        try{
         a1.withdraw(900);
        }
        catch(InsufficientFunds e){
         System.out.println(e);
        }
        a1.display();
    }//end main
}//end class
