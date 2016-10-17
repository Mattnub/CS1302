/**
 * Created by Mattnub on 10/13/2016.
 */
public class Convert {

    public double toCelcius(double f){
        double mult = (5/9);
        double celcius;
        celcius = (f - 32) * mult;
        return celcius;
    }

    public static void main(String[] args){
        double[] fahrenheit = new double[21];
        int index = 0;
        double mult = (5/9);
        double[] celcius = new double[21];
        for(int i = 0; i <= 500; i += 25){
            fahrenheit[index] = i;
            index++;
        }
        for(int i = 0; i < fahrenheit.length; i++){
            celcius[i] = (((fahrenheit[i] - 32) * (5)) / (9));
        }
        System.out.println("Fahrenheit" + "\tCelcius");
        for(int i = 0; i < fahrenheit.length; i++){

            System.out.println(fahrenheit[i] + "°F" + "\t" + (Math.round(celcius[i] * 100.0) / 100.0) + "°C");
        }
    }
}
