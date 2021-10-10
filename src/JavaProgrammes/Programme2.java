package JavaProgrammes;

import java.lang.reflect.Method;

public class Programme2 {
    static int a = 10;// static variable
    static int b = 20;// static variable

    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(Programme2.a);//10
        System.out.println(b);
        System.out.println(Programme2.a);//20
        myMethod();

    }

    public static void myMethod() {
        System.out.println(a);//10
        System.out.println(Programme2.a);//access with class name
        System.out.println(a);//20
        System.out.println(Programme2.b);//access with class name

    }
}




