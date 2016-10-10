/************************************
 Matthew Whalley
 Lab #3
 September 28, 2016
 *************************************/
public class InsufficientFunds extends Exception {
    private String error = "Not Enough Funds";
    
    public String toString(){
      return error;
    }
}
