package JavaProgrammes;

import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        int i,k;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the for the table:");
        int n = sc.nextInt();
        for (i=1; i<=10; i++){
            k=n *i;
            System.out.println(n+"*"+i +"=" + k);
        }
    }
}
