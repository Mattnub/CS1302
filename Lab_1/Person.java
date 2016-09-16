/************************************
               Matthew Whalley
                  Lab #1_3
               August 22, 2016
*************************************/

public class Person{
   /* Constructors */
   public Person(){
      setFirstName("");
      setLastName("");
      setAddress("");
      setEmail("");
   }
   
   public Person(String newFN, String newLN, String newAddress, String newEmail){
      setFirstName(newFN);
      setLastName(newLN);
      setAddress(newAddress);
      setEmail(newEmail);
   }

   /* Properties */
   private String firstName;
   private String lastName;
   private String address;
   private String email;
   
   /* Behaviors */
   public void setFirstName(String fn){
      firstName = fn;
   }
   public String getFirstName(){
      return firstName;
   }
   public void setLastName(String ln){
      lastName = ln;
   }
   public String getLastName(){
      return lastName;
   }
   public void setAddress(String adrs){
      address = adrs;
   }
   public String getAddress(){
      return address;
   }
   public void setEmail(String mail){
      email = mail;
   }
   public String getEmail(){
      return email;
   }
   
   public void display(){
      System.out.println("First Name:\t" + getFirstName());
      System.out.println("Last Name:\t" + getLastName());
      System.out.println("Address:\t" + getAddress());
      System.out.println("Email:\t\t" + getEmail());
      System.out.println();
   }
   
   public static void main(String[] args){
   
      Person p1 = new Person("Tom", "Jefferson",
       "123 Liberty Drive", "tommyJ@gmail.com");
      p1.display();
      
      Person p2 = new Person();
      p2.display(); 
   }//end main
}//end class