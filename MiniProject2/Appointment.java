import java.io.*;
import java.util.StringTokenizer;

/****************************
 Matthew Whalley
 Mini-Project 2
 18 October 2016
 ****************************/
public class Appointment {
    /** Properties **/
    private String apptDateTime;
    private String patId;
    private String dentId;
    private String procCode;

    /** Constructors **/
    public Appointment(){
        setApptDateTime("");
        setPatId("");
        setDentId("");
        setProcCode("");
    }
    public Appointment(String aDateTime, String pId, String dId, String pCode){
        setApptDateTime(aDateTime);
        setPatId(pId);
        setDentId(dId);
        setProcCode(pCode);
    }

    /** Behaviors **/
    public void select(String p){
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Appointments.txt"));
            while((line = br.readLine()) != null){
                if(line.contains(p)){
                    StringTokenizer st = new StringTokenizer(line, ":");
                    setPatId(st.nextToken());
                    setApptDateTime(st.nextToken());
                    setDentId(st.nextToken());
                    setProcCode(st.nextToken());
                }
            }
        }catch(FileNotFoundException nfe){
            System.out.println(nfe);
        }catch(IOException IOe){
            System.out.println(IOe);
        }
    }
    public void insert(String pat, String date, String dent, String proc){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Appointments.txt", true));
            bw.write(pat + ":" + date + ":" + dent + ":" + proc);
            bw.newLine();
            bw.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }

    public void setApptDateTime(String aDT){
        apptDateTime = aDT;
    }
    public String getApptDateTime(){
        return apptDateTime;
    }
    public void setPatId(String pID){
        patId = pID;
    }
    public String getPatId(){
        return patId;
    }
    public void setDentId(String dID){
        dentId = dID;
    }
    public String getDentId(){
        return dentId;
    }
    public void setProcCode(String pC){
        procCode = pC;
    }
    public String getProcCode(){
        return procCode;
    }

    /**
    public String toString(){
        return "Appointment Time: " + getApptDateTime() +
                "\nPatient ID: " + getPatId() +
                "\nDentist ID: " +getDentId() +
                "\nProcedure Code: " + getProcCode();
    }
    **/

    public void display(){
        System.out.println("Appointment Time: " + getApptDateTime());
        System.out.println("Patient ID: " + getPatId());
        System.out.println("Dentist ID: " + getDentId());
        System.out.println("Procedure Code: " + getProcCode());
    }

    public static void main(String[] args){
        Appointment a1;
        a1 = new Appointment();
        a1.select("A907");
        a1.display();
        //Appointment a2  = new Appointment();
        //a2.insert("1","2","3","4");
    }
}
