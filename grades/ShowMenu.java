package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
        Set<Map.Entry<String, Student>> entries = students.entrySet();
        if (selection == 1) {
            for (Map.Entry<String, Student> stud : entries) { // looping over hashmap
                System.out.println(stud.getKey());
                Student studentValues = stud.getValue();
                studentValues.;

//                System.out.println(stud.getKey() + " " + "Username: " + stud.getValue().getUserName() + " " + stud.getValue().getGrades());
            }
        }


    }
}
