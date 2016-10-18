/**
 * Created by Mattnub on 10/12/2016.
 */
public class Recur {
    public Recur(){}

    public void methRecur(int n){
        if(n == 100){
            System.out.println("End Recursion" + n);
        }
        else {
            System.out.println("Entering Method" + n);
            methRecur(++n);
            System.out.println("Leaving Method" + (n - 1));
        }
    }
    public static void main(String[] args){
        Recur r = new Recur();
        r.methRecur(0);
    }
}
