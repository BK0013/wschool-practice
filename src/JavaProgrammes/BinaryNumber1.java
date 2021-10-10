package JavaProgrammes;

import java.util.Scanner;

public class BinaryNumber1 {
    public static void main(String[] args) {
        BinaryNumber1 obj = new BinaryNumber1();
        obj.Binary();

    }

    public void Binary(){

        Scanner in = new Scanner(System.in);
        System.out.println("Input first binary number :");//1
        String x = in.next();
        System.out.println("Input second binary number :");//0
        String y = in.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(x,2);
        int n3=n1+n2;
        System.out.println("Sum of twonymber:" + Integer.toBinaryString(n3));//101

    }

    }
