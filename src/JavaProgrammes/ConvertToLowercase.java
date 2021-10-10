package JavaProgrammes;
import java.util.Locale;

// Java program to convert a given string to lowercase
public class ConvertToLowercase {
    public static void main(String[] args) {
        ConvertToLowercase obj = new ConvertToLowercase();
        obj.Convert();

    }

    public void Convert() {


    String S1 = new String("JAY SWAMINARAYAN");
    //Convert to LowerCase
    System.out.println(S1.toLowerCase(Locale.ROOT));


    }
}
