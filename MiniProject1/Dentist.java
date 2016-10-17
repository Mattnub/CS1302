/****************************
 Matthew Whalley
 Mini-Project 1
 10 October 2016
 ****************************/
public class Dentist extends Person {
    /** Properties **/
    private String denId;
    private String passwd;
    private String office;
    private AppointmentList appointList = new AppointmentList();

    /** Constructors **/
    public Dentist(){
        super();
        setDenId("");
        setPasswd("");
        setOffice("");
    }
    public Dentist(String fn, String ln, String em, String id, String pw, String o){
        super(fn, ln, em);
        setDenId(id);
        setPasswd(pw);
        setOffice(o);
    }

    /** Behaviors **/
    public void setDenId(String id){ denId = id; }
    public String getDenId(){ return denId; }
    public void setPasswd(String pw){ passwd = pw; }
    public String getPasswd(){ return passwd;}
    public void  setOffice(String o){ office = o; }
    public String getOffice(){ return office; }
    public void addAppointment(Appointment a){
        appointList.addAppointment(a);
    }

    public void display(){
        super.display();
        System.out.println("DentistID: " + getDenId());
        System.out.println("Password: " + getPasswd());
        System.out.println("Office: " + getOffice());
        appointList.display();
    }

    public static void main(String[] args){
        Appointment ap1;
        ap1 = new Appointment("Dec 1, 2013, 9am", "A900", "D201", "P321");
        Appointment ap2;
        ap2 = new Appointment("1","2","3","4");
        Dentist d1;
        d1 = new Dentist("Frank","Martin","fm@gmail.com","D201","frank","539");
        d1.addAppointment(ap1);
        d1.addAppointment(ap2);
        d1.display();

    }
}
