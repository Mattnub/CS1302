/************************************
             Matthew Whalley
                 Lab #2
             August 22, 2016
 *************************************/

public class Address{
   /* Constructors */
   public Address(){
      setStreet("");
      setCity("");
      setState("");
      setZipcode(0);
   }
   
   public Address(String newStreet, String newCity,
    String newState, int newZip){
      setStreet(newStreet);
      setCity(newCity);
      setState(newState);
      setZipcode(newZip);  
            
   }

   /* Properties */
   private String street;
   private String city;
   private String state;
   private int zipcode;
   
   /* Behaviors */
   public void setStreet(String str){
      street = str;
   }
   public String getStreet(){
      return street;
   }
   public void setCity(String c){
      city = c;
   }
   public String getCity(){
      return city;
   }
   public void setState(String st){
      state = st;
   }
   public String getState(){
      return state;
   }
   public void setZipcode(int zip){
      zipcode = zip;
   }
   public int getZipcode(){
      return zipcode;
   }
   
   public void display(){
      System.out.println("Street:\t" + getStreet());
      System.out.println("City:\t" + getCity());
      System.out.println("State:\t" + getState());
      System.out.println("Zipcode:" + getZipcode());
      System.out.println();
   }
   
   public static void main(String[] args){
      
      Address a1 = new Address("541 Bulldozer Lane", "Motor City",
       "Texas", 87825);
      //a1.display();
      
      Address a2 = new Address();
      //a2.display();
   }//end main
}//end class