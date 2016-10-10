import java.io.*;
import java.util.*;
/************************************************
 * 
 ************************************************/
public class ReadInts {
    /** Properties **/
    private Scanner scan;
    private File f;
    private boolean exist, write, read;
    private long length;
    private int test = 0;
    ;

    /** Constructors **/
    public ReadInts(String name){
        f = new File(name);
        try {
            scan = new Scanner(f);
            while(scan.hasNextInt()){
                test += scan.nextInt();
            }
            System.out.println(test);


        }catch(FileNotFoundException fe){
            System.out.println(fe);
        }catch(IOException ie){
            System.out.println(ie);
        }
            //br = new BufferedReader(f);
    }

    /** Behaviors **/
    public boolean isExist(){
        exist = f.exists();
        return exist;
    }
    public boolean isWrite(){
        write = f.canWrite();
        return write;
    }
    public boolean isRead(){
        read = f.canRead();
        return read;
    }
    public long getLength(){
        length = f.length();
        return length;
    }
    public String toString(){
        return "Exists: " + isExist() + "\nCan Write: " + isWrite()
                + "\nCan Read: " + isRead() + "\nLength: " + getLength();
    }

    public static void main(String[] args){
        ReadInts ri = new ReadInts("mydata.dat");
        System.out.println(ri.toString());
    }
}
