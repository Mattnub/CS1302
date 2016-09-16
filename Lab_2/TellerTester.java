/**
 * Created by Mattnub on 09/02/2016.
 */
public class TellerTester {
    public static void main(String[] args){
        Teller t1;
        t1 = new Teller(481542, "Jeff", "Bridges", new Address("123 Main", "Athens", "GA", 30605),
                "jBridge@gmail.com", 60000, 40, "Day");
        t1.display();
    }
}
