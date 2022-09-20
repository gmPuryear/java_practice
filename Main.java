import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;


// 'Main is the name of the class that encapsulates the methods, like 'main'
public class Main {
    String s = "java ArgExample A B C D";
    // main method, and is a 'member' of the Main class.
    // System is a class and then we can get the member: out, then we get the method of println
    // Public is a access modifier
    public static void main(String[] args) {
//        System.out.println("Hello!");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//
//        String yolo = "you only live once!";
//        String lifeMotto = (name + ", " + yolo); // this is an example of an expression since it combines values
//        System.out.println(lifeMotto);

//        int x = 5; // primitive type
//        Integer y = 5; // of type Integer object
//        System.out.println(x);
//        System.out.println(y);

//        public static final double PI = 3.14159; // this makes PI a global variable which other classes can use
//
//        // Making variables is a 2-step process:
//        // step 1: declare
//        int x;
//        // step 2: initialize
//        x = 5;
//        x = 10;

// Data types:
        // ** String is NOT a primitive type
        // - int: longer than short as it is 32 bits
        // - bool: true/false
        // - byte: sequence of 8 bits so 1s and zeros that can stall a VERY small range of number or characters using ASCE!!
        // - char: allows you to store 'unicode' so characters from other languages, etc.
        // - short: 16 bit (small numbers) used for numbers and can use negative
        // - long: 64 bit end with and L
        // - float: 32 bit can't use. Use an F at the end to make sure its a float. A 'smaller' container than a double
        // - double: 64 bit so a double is more precise than a float

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string please");
        String x = scanner.nextLine(); // gets a line a returns it
        System.out.println(x);
        System.out.println("Enter an int");
        int y = scanner.nextInt();
        System.out.println("You entered: " + y);




    }
}