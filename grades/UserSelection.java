package grades;

import grades.choices.FindStudent;
import grades.choices.ShowAllStudents;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static grades.GradesApplication.scanner;

public class UserSelection {

    static public void userSelection (HashMap <String, Student> students) {
        System.out.println(UserMenu.userMenu());
        System.out.println("Please enter your selection: ");
        int selection = scanner.nextInt();
        scanner.nextLine(); // this consumes the newline character after scanner.nextInt() so the next input won't be skipped

        switch (selection) {
            case 1:
                ShowAllStudents.showAllStudents(students);
            case 2:
                FindStudent.findStudent(students);
            case 3:
                AddStudent.addStudent(students);
            case 4:
                System.out.print("Good bye from switch statement!");
                System.exit(0);
        }
    }



}
