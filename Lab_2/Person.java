import com.sun.jndi.cosnaming.IiopUrl;

/************************************
           Matthew Whalley
               Lab #2
           August 22, 2016
*************************************/

public class Person{
   /* Constructors */
   public Person(){
      setFirstName("");
      setLastName("");
      addr = new Address();
      setEmail("");
   }
   
   public Person(String newFN, String newLN, Address newAddr, String newEmail){
      setFirstName(newFN);
      setLastName(newLN);
      addr = newAddr;
      setEmail(newEmail);
   }

   /* Properties */
   private String firstName;
   private String lastName;
   private Address addr;
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
   public void setAddress(Address a){
      addr = a;
   }
   public Address getAddress(){
      return addr;
   }
   public void setEmail(String mail){
      email = mail;
   }
   public String getEmail(){
      return email;
   }
   
   public void display(){
      System.out.println("First Name:\t" + getFirstName());
      System.out.println("Last Name:\t" + getLastName() + "\n");
      addr.display();
      System.out.println("Email:\t\t" + getEmail());
      System.out.println();
   }
   
   public static void main(String[] args){
      Address a = new Address("123 Corner", "Angle", "RT", 12345);
      Person p1 = new Person("Tom", "Jefferson", a, "tommyJ@gmail.com");
     // p1.display();
      
      Person p2 = new Person();
      p2.setAddress(new Address("123 Curve", "Oval", "Cir", 54321));
      p2.setFirstName("Bill");
      p2.setLastName("Martigans");
      p2.setEmail("BMart22@gmail.com");
     // p2.display();
   }//end main
}//end class