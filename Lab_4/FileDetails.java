/**
 * Created by Mattnub on 10/02/2016.
 */
import java.io.*;
public class FileDetails {

    /** Properties **/
    private boolean exist;
    private boolean canWrite;
    private boolean canRead;
    private long size;
    private File f;


    /** Constructors **/
    public FileDetails(String n){
        f = new File(n);
    }
    /** Behaviors **/
    public boolean getExists(){
        exist = f.exists();
        return exist;
    }
    public boolean getCanWrite(){
        canWrite = f.canWrite();
        return canWrite;
    }
    public boolean getCanRead(){
        canRead = f.canRead();
        return canRead;
    }
    public long getLength(){
        size = f.length();
        return size;
    }
    public String toString(){
        return "Exists: " + getExists() + "\nCan Write: " + getCanWrite()
                + "\nCan Read: " + getCanRead() + "\nLength: " + getLength();
    }


    public static void main(String[] args){

        FileDetails fd = new FileDetails("anyfile.doc");
        System.out.println(fd.toString());
    }
}
