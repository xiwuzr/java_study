import java.sql.SQLOutput;
import java.util.Scanner;

public class MyJavaScan {
    public static void main(String[] args) {
        int aInt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        aInt=sc.nextInt();
        String aString;
        System.out.println("Enter a number:");
        aString=sc.nextLine();
        System.out.println("Enter a number:");
        String bString=sc.next();
        System.out.println(aInt);
        System.out.println(aString);
        System.out.println(bString);
    }
}
