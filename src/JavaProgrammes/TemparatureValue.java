package JavaProgrammes;

import java.util.Scanner;

public class TemparatureValue {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input a degree in Fahrenhit:");
        double Fahrenhit = input.nextDouble();

        double celsius = (( 5 * (Fahrenhit - 32.0))/9.0);
        System.out.println(Fahrenhit + "degree Fahrenhit is equal to" + celsius +"in celsius" );
    }
}
