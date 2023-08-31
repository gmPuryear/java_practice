package grades;

import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("###.##");
        Set<Map.Entry<String, Student>> entries = students.entrySet();
        if (selection == 1) {
            for (Map.Entry<String, Student> stud : entries) { // looping over hashmap
                Student studentInfo = stud.getValue();
                System.out.println(
                        "Name: " +  studentInfo.getName() +
                        "\nUsername: " +  studentInfo.getUserName() +
                        "\nGrades: " + studentInfo.getGrades() +
                        "\nAverage: " + Math.round(studentInfo.getGradeAverage()) +
                        "\n------------------------------------------");

//                System.out.println(stud.getKey() + " " + "Username: " + stud.getValue().getUserName() + " " + stud.getValue().getGrades());
            }
        }


    }
}
