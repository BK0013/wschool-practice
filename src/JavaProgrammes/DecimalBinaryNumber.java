package JavaProgrammes;
import java.util.Scanner;
//A java program to convert a decimal number to binary number.


public class DecimalBinaryNumber {
    public static void main(String[] args) {
        DecimalBinaryNumber obj = new DecimalBinaryNumber();
        obj.Debi();

    }
    public void Debi(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Decimal number :5");//5
        System.out.println("Binary number is");
        System.out.println(Integer.toBinaryString( 5));//101

        // System.out.println();


    }


}
