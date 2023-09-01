package grades;

import grades.choices.FindStudent;
import grades.choices.ShowAllStudents;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static grades.GradesApplication.scanner;

public class UserSelection {

    static public void userSelection (HashMap<String, Student> students) {
        System.out.println(UserMenu.userMenu());
        System.out.println("Please enter your selection: ");
        int selection = scanner.nextInt();
        System.out.println(selection);
        DecimalFormat df = new DecimalFormat("###.##");
        Set<Map.Entry<String, Student>> entries = students.entrySet();

        switch (selection) {
            case 1:
                ShowAllStudents.showAllStudents(students, entries);

            case 2:
                FindStudent.findStudent(students);
        }
    }



}
