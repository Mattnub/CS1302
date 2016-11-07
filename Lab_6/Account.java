/************************************
               Matthew Whalley
                  Lab #6
               October 29, 2016
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
   public Account next = null;
   
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
   public void display(){
      System.out.println("Account Number:\t" + getAcctNo());
      System.out.println("Account Owner:\t" + getOwner());
      System.out.println("Balance:\t$" + getBalance());
      System.out.println();
   }
   
   public static void main(String[] args){
      Account a1;
      a1 = new Account(90002, "Susan Slater", 450.00);
      a1.display();
      
      Account a2 = new Account();
      a2.display();
   }//end main
}//end class