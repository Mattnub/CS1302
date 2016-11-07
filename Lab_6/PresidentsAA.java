import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mattnub on 10/29/2016.
 */
public class PresidentsAA {
    public static ArrayList<String> list = new ArrayList<>();

    public PresidentsAA(){
        list.add("George Washington");
        list.add("John Adams");
        list.add("Thomas Jefferson");
        list.add("James Madison");
        list.add("James Monroe");
        list.add("John Quincy Adams");
        list.add("Andrew Jackson");
        list.add("Martin van Buren");
        list.add("William H Harrison");
        list.add("John Tyler");
    }

    public static void main(String[] args){
        PresidentsAA p1 = new PresidentsAA();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter President Number(1-10): ");
        int in = scan.nextInt();

        System.out.println("President " + list.get(in - 1));
    }
}
