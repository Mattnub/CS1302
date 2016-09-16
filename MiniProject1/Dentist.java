/***********************************
            Matthew Whalley
 ***********************************/
public class Dentist extends Person {
    /** Properties **/
    private String denId;
    private String passwd;
    private String office;
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

    public String toString(){
        return super.toString() + "Dentist ID:\t" + getDenId() +
                "\nPassword:\t" + getPasswd() +
                "\nOffice:\t" + getOffice() + "\n";
    }
    public static void main(String[] args){
        Dentist d1;
        d1 = new Dentist("Frank","Martin","fm@gmail.com","D201","frank","539");
        System.out.println(d1.toString());
    }
}
