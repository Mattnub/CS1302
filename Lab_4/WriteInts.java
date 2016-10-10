import java.io.*;
/**
 * Created by Mattnub on 10/07/2016.
 */
public class WriteInts {

    /** Properties **/
    private File f;
    private FileOutputStream fos;
    private DataOutputStream dos;
    private PrintWriter pw;
    private BufferedWriter bw;
    private boolean exist;
    private boolean write;
    private boolean read;
    private long length;

    /** Constructors **/
    public WriteInts(String name, int[] num){
        f = new File(name);
        try{
            pw = new PrintWriter(f);
            bw = new BufferedWriter(pw);
            for(int i = 0; i < num.length; i++) {
                pw.write(Integer.toString(num[i]));
            }
            pw.flush();
            pw.close();
        }catch(FileNotFoundException notFound){
            System.out.println(notFound);
        }catch(IOException ioExcep){
            System.out.println(ioExcep);
        }


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
                + "\nCan Read: " + isRead() + "\nLength:" + getLength();
    }

    public static void main(String[] args){
        int myArr[] = {16,31,90,45,89};
        WriteInts wi = new WriteInts("mydata.dat", myArr);
        System.out.println(wi.toString());
    }
}
