/**
 * Created by Mattnub on 09/16/2016.
 */
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

    public String toString(){
        return "Appointment Date: " + getApptDateTime() +
                "\nPatient ID:\t" + getPatId() +
                "\nDentist ID:\t" + getDentId() +
                "\nProcedure Code:\t" + getProcCode();
    }

    public static void main(String[] args){
        Appointment a1;
        a1 = new Appointment();
        System.out.println(a1.toString() + "\n");

        Appointment a2;
        a2 = new Appointment("Dec 1, 2013, 9am","A900","D201","P321");
        System.out.println(a2.toString());
    }
}
