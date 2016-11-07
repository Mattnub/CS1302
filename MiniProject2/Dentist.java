import java.io.*;
import java.util.StringTokenizer;

/****************************
 Matthew Whalley
 Mini-Project 2
 18 October 2016
 ****************************/
public class Dentist extends Person {
    /** Properties **/
    private File f;
    private FileReader fr;
    private BufferedReader br;
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
    public void select(String dentistID){
        String line;
        try {
            br = new BufferedReader(new FileReader("Dentists.txt"));
            while((line = br.readLine()) != null){
                if(line.contains(dentistID)){
                    StringTokenizer st = new StringTokenizer(line, ":");
                    setDenId(st.nextToken());
                    setPasswd(st.nextToken());
                    setFirstName(st.nextToken());
                    setLastName(st.nextToken());
                    setEmail(st.nextToken());
                    setOffice(st.nextToken());
                }
            }
        }catch(FileNotFoundException nfe){
            System.out.println(nfe);
        }catch(IOException IOe){
            System.out.println(IOe);
        }

        try {
            br = new BufferedReader(new FileReader("Appointments.txt"));
            while((line = br.readLine()) != null){
                if(line.contains(getDenId())){
                    StringTokenizer st = new StringTokenizer(line, ":");
                    Appointment a1 = new Appointment();
                    a1.setPatId(st.nextToken());
                    a1.setApptDateTime(st.nextToken());
                    a1.setDentId(st.nextToken());
                    a1.setProcCode(st.nextToken());
                    appointList.addAppointment(a1);
                }
            }
        }catch(FileNotFoundException nfe){
            System.out.println(nfe);
        }catch(IOException IOe){
            System.out.println(IOe);
        }





    }
    public void insert(String dIdent, String pwrd, String fn, String ln, String em, String of){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Dentists.txt", true));
            bw.write(dIdent + ":" + pwrd + ":" + fn + ":" + ln + ":" + em + ":" + of);
            bw.newLine();
            bw.close();
        }catch(IOException ioe){
            System.out.println();
        }
    }
    public void setDenId(String id){ denId = id; }
    public String getDenId(){ return denId; }
    public void setPasswd(String pw){ passwd = pw; }
    public String getPasswd(){ return passwd;}
    public void  setOffice(String o){ office = o; }
    public String getOffice(){ return office; }
    public void addAppointment(Appointment a){
        appointList.addAppointment(a);
    }

    /**
    public String toString(){
        return super.toString() +
                "\nDentist ID: " + getDenId() +
                "\nPassword: " + getPasswd() +
                "\nOffice: " + getOffice() +
                "\n" + appointList.toString();

    }
    **/

    public void display(){
        super.display();
        System.out.println("DentistID: " + getDenId());
        System.out.println("Password: " + getPasswd());
        System.out.println("Office: " + getOffice());
        appointList.display();
    }

    public static void main(String[] args){
        Dentist d1;
        d1 = new Dentist();
        d1.select("D203");
        d1.display();
    }
}
