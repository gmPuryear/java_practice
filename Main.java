import java.sql.SQLOutput;
import java.util.Scanner;

// 'Main is the name of the class that encapsulates the methods, like 'main'
public class Main {
    // main method, and is a 'member' of the Main class.
    // System is a class and then we can get the member: out, then we get the method of println
    // Public is a access modifier
    public static void main(String[] args) {
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        String yolo = "you only live once!";
        String lifeMotto = (name + ", " + yolo); // this is an example of an expression since it combines values
        System.out.println(lifeMotto);
    }

}