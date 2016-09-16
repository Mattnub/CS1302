/**
 * Created by Mattnub on 09/16/2016.
 */
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

    public String toString(){
        return "First Name:\t" + getFirstName() +
                "\nLast Name:\t" + getLastName() +
                "\nEmail:\t" + getEmail() + "\n";
    }

    public static void main(String[] args){
        Person p1;
        p1 = new Person("Bill","Smith","bsmith@gmail.com");
        System.out.println(p1.toString());

    }
}
