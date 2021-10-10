package JavaProgrammes;

import java.util.Scanner;

public class SumofTwonumbers {
    public static void main(String[] args) {
        SumofTwonumbers obj = new SumofTwonumbers();
        obj.Sum();
    }
    public void Sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = in.nextInt();

        System.out.print("Input second number: ");
        int n2 = in.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));

        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));

        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));

        System.out.println(n1 + " mod " + n2 + " = " + (n1 % n2));
    }

}
