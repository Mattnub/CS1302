/**
 * Created by Mattnub on 09/16/2016.
 */
public class Patient extends Person {

    /** Properties **/
    private String patId;
    private String passwd;
    private String addr;
    private String insCo;
    private Appointment appoint;

    /** Constructors **/
    public Patient(){
        super();
        setPatId("");
        setPasswd("");
        setAddr("");
        setInsCo("");
        appoint = new Appointment();
    }
    public Patient(String fn, String ln, String em, String pid,
                   String pass, String ad, String ico, Appointment ap){
        super(fn, ln, em);
        setPatId(pid);
        setPasswd(pass);
        setAddr(ad);
        setInsCo(ico);
        appoint = ap;
    }

    /** Behaviors **/
    public void setPatId(String pId){ patId = pId; }
    public String getPatId(){ return patId; }
    public void setPasswd(String pw){ passwd = pw; }
    public String getPasswd(){ return passwd; }
    public void setAddr(String a){ addr = a; }
    public String getAddr(){ return addr; }
    public void setInsCo(String ic){ insCo = ic; }
    public String getInsCo(){ return insCo; }

    public String toString(){
        return super.toString() + "Patient ID:\t" + getPatId() +
                "\nPassword:\t" + getPasswd() +
                "\nAddress:\t" + getAddr() +
                "\nInsurance Company: " + getInsCo() +
                "\n" + appoint.toString();
    }

    public static void main(String[] args){
        Appointment a1;
        a1 = new Appointment("Dec 1, 2013, 9am","A900","D201","P321");
        Patient p1;
        p1 = new Patient("Bill","Smith","bsmith@gmail.com",
                "A901","9999","Acworth","Aetna",a1);
        System.out.println(p1.toString());
    }
}
