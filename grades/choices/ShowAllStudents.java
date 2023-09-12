package grades.choices;

import grades.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShowAllStudents {

    public static void showAllStudents(HashMap <String, Student> students) {

        students.forEach((key, value) -> System.out.println(
                    "Name: " +  key +
                            "\nUsername: " +  value.getUserName() +
                            "\nGrades: " + value.getGrades() +
                            "\nAverage: " + Math.round(value.getGradeAverage()) +
                            "\n------------------------------------------"
            ));
//        ExitProgram.exitProgram(students);
    }
}
