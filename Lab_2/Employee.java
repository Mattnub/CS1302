/************************************
            Matthew Whalley
                Lab #2
            August 22, 2016
 *************************************/
public class Employee extends Person {
    /** Properties **/
    private int eNum;
    private double salary;

    /** Constructors **/
    public Employee(){
        super();
        setENum(0);
        setSalary(0.0);
    }
    public Employee(int empN, String fn, String ln, Address ad, String em, double s){
        super(fn, ln, ad, em);
        setENum(empN);
        setSalary(s);
    }
    /** Behaviors **/
    public void setENum(int eID){ eNum = eID;}
    public int getENum(){ return eNum;}

    public void setSalary(double sal){ salary = sal;}
    public double getSalary(){ return salary;}

    public void display(){
        super.display();
        System.out.println("Employee ID:\t" + getENum());
        System.out.println("Salary:\t"+ getSalary());
    }

    public static void main(String[] args){
        Employee e1;
        e1 = new Employee(2323, "Bill", "Clinton", new Address("123 Main",
                "Atlanta", "GA", 30111), "bc@msn.com", 43000.00);
        e1.display();

        Address a1;
        a1 = new Address("123 Side", "Athens", "GA", 30608);

        Employee e2;
        e2 = new Employee();
        e2.setENum(1234);
        e2.setFirstName("Matt");
        e2.setLastName("Whalley");
        e2.setAddress(a1);
        e2.setEmail("mw@gmail.com");
        e2.setSalary(12000.00);
        e2.display();
    }
}
