/**
 * Created by Mattnub on 10/13/2016.
 */
public class Reverse3 {
    public char[] charArray = {'S','t','e','v','e'};

    public Reverse3(){}

    public static void reverse3(char[] c){
        for(int i = 4; i >= 0; i--){
            System.out.print(c[i]);
        }
    }
    public static void main(String[] args){
        char[] charArray = {'S','t','e','v','e'};
        reverse3(charArray);
    }
}
