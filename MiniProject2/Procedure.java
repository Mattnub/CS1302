import java.io.*;
import java.util.StringTokenizer;

/****************************
 Matthew Whalley
 Mini-Project 2
 18 October 2016
 ****************************/
public class Procedure {

    /** Properties **/
    private File f;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private PrintWriter pw;
    private String procCode;
    private String procName;
    private String procDesc;
    private double cost;

    /** Constructors **/
    public Procedure(){
        setProcCode("");
        setProcName("");
        setProcDesc("");
        setCost(0.00);
    }

    public Procedure(String pCode, String pName,
                     String pDesc, double c){
        setProcCode(pCode);
        setProcName(pName);
        setProcDesc(pDesc);
        setCost(c);
    }

    /** Behaviors **/
    public void select(String prCode){
        String line;
        try {
            br = new BufferedReader(new FileReader("Procedures.txt"));
                while((line = br.readLine()) != null) {
                    if(line.contains(prCode)){
                        StringTokenizer st = new StringTokenizer(line, ":");
                        setProcCode(st.nextToken());
                        setProcName(st.nextToken());
                        setProcDesc(st.nextToken());
                        setCost(Double.valueOf(st.nextToken()));
                    }
                }

        }catch(FileNotFoundException notFoundE){
            System.out.println(notFoundE);
        }catch(IOException IOe){
            System.out.println(IOe);
        }
    }
    public void insert(String code, String name, String desc, double cost){
        try {
            f = new File("Procedures.txt");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(code + ":" + name + ":" + desc + ":" + cost);
            bw.newLine();
            bw.close();
        }catch(FileNotFoundException nfe){
            System.out.println(nfe);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
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

    /**
    public String toString(){
        return "Procedure Code: " + getProcCode() +
                "\nProcedure Name: " + getProcName() +
                "\nProcedure Description: " + getProcDesc() +
                "\nCost: $" + getCost();
    }
    **/

    public void display(){
        System.out.println("Procedure Code: " + getProcCode());
        System.out.println("Procedure Name: " + getProcName());
        System.out.println("Procedure Description: " + getProcDesc());
        System.out.println("Cost: $" + getCost());
    }

    public static void main(String[] args){
        Procedure p1;
        p1 = new Procedure();
        p1.select("P119");
        p1.display();

    }
}
