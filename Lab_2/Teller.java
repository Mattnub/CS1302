/************************************
            Matthew Whalley
                 Lab #2
            August 22, 2016
 *************************************/
public class Teller extends Employee {
    /** Properties **/
    private double hoursWorked;
    private String shift;

    /** Constructors **/
    public Teller(){
        super();
        setHoursWorked(0.0);
        setShift("");
    }
    public Teller(int en, String fn, String ln, Address ad,
                  String em, double sal, double h, String s){
        super(en, fn, ln, ad, em, sal);
        setHoursWorked(h);
        setShift(s);
    }

    /** Behaviors **/
    public void setHoursWorked(double hw){
        hoursWorked = hw;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public void setShift(String sh){
        shift = sh;
    }
    public String getShift(){
        return shift;
    }

    public void display(){
        super.display();
        System.out.println("Hours Worked:\t" + getHoursWorked());
        System.out.println("Shift:\t" + getShift());
    }

    public static void main(String[] args){
        Teller t1;
        t1 = new Teller(1111, "Bob", "Joe", new Address("321 Joe Drive", "Dirt", "GA", 32165),
                "bJoe@gmail.com", 50000, 52, "Day");
        t1.display();

        Teller t2;
        t2 = new Teller();
        t2.setENum(9999);
        t2.setFirstName("Billy");
        t2.setLastName("Wiseman");
        t2.setAddress(new Address("12 Main", "Marietta", "GA", 30605));
        t2.setEmail("bWise@gmail.com");
        t2.setSalary(20000);
        t2.setHoursWorked(35);
        t2.setShift("Night");
        t2.display();
    }
}
