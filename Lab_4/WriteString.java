import java.io.*;

/**
 * Created by Mattnub on 10/05/2016.
 */

public class WriteString {

    /** Properties **/
    private boolean exist;
    private boolean read;
    private boolean write;
    private long length;
    private FileInputStream fin;
    private FileOutputStream fout;
    private PrintStream ps;
    private File f;

    /** Constructors **/

    public WriteString(String name, String in){
        f = new File(name);
        try {
            fout = new FileOutputStream(f);
            ps = new PrintStream(fout);
            ps.println(in);
            ps.close();
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
    }

    /** Behaviors **/

    public boolean isExist(){
        exist = f.exists();
        return exist;
    }
    public boolean isRead(){
        read = f.canRead();
        return read;
    }
    public boolean isWrite(){
        write = f.canWrite();
        return write;
    }
    public long getLength(){
        length = f.length();
        return length;
    }

    public String toString(){
        return "Exists: " + isExist() + "\nCanRead: " + isRead()
                + "\nCanWrite: " + isWrite() + "\nLength: " + getLength();
    }

    public static void main(String[] args){
        WriteString ws = new WriteString("f1.txt","Hello World");
        System.out.println(ws.toString());
    }
}
