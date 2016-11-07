import java.io.*;
import java.util.StringTokenizer;

/****************************
 Matthew Whalley
 Mini-Project 2
 18 October 2016
 ****************************/
public class Patient extends Person {

    /** Properties **/
    private File f;
    private FileReader fr;
    private BufferedReader br;
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
    public Patient(Appointment app){
        appoint = app;
    }

    /** Behaviors **/
    public void select(String p){
        String line;
        try {
            br = new BufferedReader(new FileReader("Patients.txt"));
            while((line = br.readLine()) != null){
                if(line.contains(p)){
                    StringTokenizer st = new StringTokenizer(line, ":");
                    setPatId(st.nextToken());
                    setPasswd(st.nextToken());
                    setFirstName(st.nextToken());
                    setLastName(st.nextToken());
                    setEmail(st.nextToken());
                    setAddr(st.nextToken());
                    setInsCo(st.nextToken());
                }
            }
        }catch(FileNotFoundException fileE){
            System.out.println(fileE);
        }catch(IOException IOe){
            System.out.println(IOe);
        }
        appoint.select(getPatId());
    }
    public void insert(String p, String pw, String fn, String ln, String a, String pass, String inCo){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Patients.txt", true));
            bw.write(p + ":" + pw + ":" + fn + ":" + ln + ":" + a + ":" + pass + ":" + inCo);
            bw.newLine();
            bw.close();
        }catch(FileNotFoundException nfe){
            System.out.println(nfe);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }

    public void setPatId(String pId){ patId = pId; }
    public String getPatId(){ return patId; }
    public void setPasswd(String pw){ passwd = pw; }
    public String getPasswd(){ return passwd; }
    public void setAddr(String a){ addr = a; }
    public String getAddr(){ return addr; }
    public void setInsCo(String ic){ insCo = ic; }
    public String getInsCo(){ return insCo; }

    /**
    public String toString(){
        return super.toString() +
                "\nPatient ID: " + getPatId() +
                "\nPassword: " + getPasswd() +
                "\nAddress: " + getAddr() +
                "\nInsurance Company: " + getInsCo();
    }
    **/

    public void display(){
        super.display();
        System.out.println("Patient ID: " + getPatId());
        System.out.println("Password: " + getPasswd());
        System.out.println("Address: " + getAddr());
        System.out.println("Insurance Company: " + getInsCo());
        appoint.display();
    }

    public static void main(String[] args){
        Patient p1;
        p1 = new Patient();
        p1.select("A901");
        p1.display();

    }
}
