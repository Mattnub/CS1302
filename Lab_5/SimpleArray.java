/**
 * Created by Mattnub on 10/13/2016.
 */
public class SimpleArray {
    public static void main(String[] args){
        int[] myArr = new int[100];
        int index = 0;
        for(int i = 500; i < 600; i++){
            myArr[index] = i;
            index++;
        }

        for(int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }
    }
}
