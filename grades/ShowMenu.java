package grades;

import java.util.HashMap;
import java.util.Scanner;

public class ShowMenu {

    public static void showMenu(HashMap students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1: Show all students: " +
                "\n2: Find student: " +
                "\n3: Add Student: " +
                "\n4: Exit: "
        );
        System.out.println("Please enter your selection: ");
        int selection = scanner.nextInt();
        System.out.println(selection);
        if (selection == 1) {
            System.out.println();
        }

    }
}
