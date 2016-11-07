/****************************
 Matthew Whalley
 Mini-Project 2
 18 October 2016
 ****************************/
public class Person {
    /** Properties **/
    private String firstName;
    private String lastName;
    private String email;

    /** Constructors **/
    public Person(){
        setFirstName("");
        setLastName("");
        setEmail("");
    }

    public Person(String fn, String ln, String e){
        setFirstName(fn);
        setLastName(ln);
        setEmail(e);
    }

    /** Behaviors **/
    public void setFirstName(String fn){ firstName = fn; }
    public String getFirstName(){ return firstName; }
    public void setLastName(String ln){ lastName = ln; }
    public String getLastName(){ return lastName; }
    public void setEmail(String em){ email = em; }
    public String getEmail(){ return email; }

    /**
    public String toString(){
        return "First Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nEmail: " + getEmail();
    }
     **/

    public void display(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Email: " + getEmail());
    }

    public static void main(String[] args){
        Person p1;
        p1 = new Person("Bill","Smith","bsmith@gmail.com");
        p1.display();

    }
}
