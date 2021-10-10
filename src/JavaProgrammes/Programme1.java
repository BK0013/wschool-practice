package JavaProgrammes;

// Created by Mr. Bharat Gajera
public class Programme1 {
    //Declare Instance Variables
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        System.out.println(obj.x);// access by object into static variable
        System.out.println(obj.y);// access by object into static variable
    }

    public void test() {
        //Instance are
        System.out.println(x);
        System.out.println(y);
    }
}