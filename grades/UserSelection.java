package grades;

import grades.choices.FindStudent;
import grades.choices.ShowAllStudents;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static grades.GradesApplication.scanner;

public class UserSelection {

    static public void userSelection (HashMap<String, Student> students) {
        System.out.println(UserMenu.userMenu());
        System.out.println("Please enter your selection: ");
        int selection = scanner.nextInt();
        scanner.nextLine(); // this consumes the newline character after scanner.nextInt() sp the next input wont be skipped
        DecimalFormat df = new DecimalFormat("###.##");
        Set<Map.Entry<String, Student>> entries = students.entrySet();

        switch (selection) {
            case 1:
                ShowAllStudents.showAllStudents(students, entries);
            case 2:
                FindStudent.findStudent(entries);
        }
    }



}
