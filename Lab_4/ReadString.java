import java.io.*;
/**
 * Created by Mattnub on 10/10/2016.
 */
public class ReadString {
    private File f;
    private FileInputStream fis;
    private DataInputStream dis;
    private FileReader fr;
    private InputStreamReader isr;
    private BufferedReader br;
    private String text = "";
    private String line;

    public ReadString(String name){
        f = new File(name);
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            line = br.readLine();
            while(line != null){
                text += line;
                line = br.readLine();
            }
            System.out.println(text);

        }catch(FileNotFoundException fn){
            System.out.println(fn);
        }catch(IOException ie){
            System.out.println(ie);
        }
    }

    public static void main(String[] args){
        ReadString rs = new ReadString("f1.txt");
    }
}
