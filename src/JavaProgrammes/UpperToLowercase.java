package JavaProgrammes;

import java.util.Locale;
import java.util.Scanner;


public class UpperToLowercase {
    private static Scanner sc;

    public static void main(String[] args) {
        String Upperstr;
        sc = new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        System.out.println("/n Enter Uppercase String =");
        Upperstr = sc.nextLine();
        String UpperStr1 = Upperstr.toLowerCase(Locale.ROOT);
        System.out.println("/n The Lowercase String = "+ UpperStr1);

    }
}
