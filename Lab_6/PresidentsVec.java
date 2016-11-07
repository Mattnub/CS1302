import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Mattnub on 10/29/2016.
 */
public class PresidentsVec {
    public static Vector<String> vec = new Vector<>();

    public  PresidentsVec(){
        vec.add("George Washington");
        vec.add("John Adams");
        vec.add("Thomas Jefferson");
        vec.add("James Madison");
        vec.add("James Monroe");
        vec.add("John Quincy Adams");
        vec.add("Andrew Jackson");
        vec.add("Martin van Buren");
        vec.add("William H Harrison");
        vec.add("John Tyler");
    }

    public static void main(String[] args){
        PresidentsVec p1 = new PresidentsVec();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter President Number(1-10): ");
        int in = scan.nextInt();

        System.out.println("President " + vec.get(in - 1));
    }
}
