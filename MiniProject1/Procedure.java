/**
 * Created by Mattnub on 09/16/2016.
 */
public class Procedure {

    /** Properties **/
    private String procCode;
    private String procName;
    private String procDesc;
    private double cost;

    /** Constructors **/
    public Procedure(){
        setProcCode("");
        setProcName("");
        setProcDesc("");
        setCost(0.0);
    }

    public Procedure(String pCode, String pName,
                     String pDesc, double c){
        setProcCode(pCode);
        setProcName(pName);
        setProcDesc(pDesc);
        setCost(c);
    }

    /** Behaviors **/
    public void setProcCode(String pc){
        procCode = pc;
    }
    public String getProcCode(){
        return procCode;
    }
    public void setProcName(String pn){
        procName = pn;
    }
    public String getProcName(){
        return procName;
    }
    public void setProcDesc(String pd){
        procDesc = pd;
    }
    public String getProcDesc(){
        return procDesc;
    }
    public void setCost(double c){
        cost = c;
    }
    public double getCost(){
        return cost;
    }

    public String toString(){
        return "Procedure Code:\t" + getProcCode() +
                "\nProcedure Name:\t" + getProcName() +
                "\nProcedure Description:\t" + getProcDesc() +
                "\nProcedure Cost:\t$" + getCost();
    }

    public static void main(String[] args){
        Procedure p1;
        p1 = new Procedure();
        System.out.println(p1.toString() + "\n");

        p1.setProcCode("P119");
        p1.setProcName("Xrays");
        p1.setProcDesc("Take Xrays of all teeth");
        p1.setCost(320);
        System.out.println(p1.toString());

        Procedure p2;
        p2 = new Procedure("P321","Cavity","Fill a cavity",319);
        System.out.println("\n" + p2.toString());
    }
}
