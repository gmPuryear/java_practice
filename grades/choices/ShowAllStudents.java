package grades.choices;

import grades.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShowAllStudents {

    public static void showAllStudents(Set<Map.Entry<String, Student>> entries) {
        for (Map.Entry<String, Student> stud : entries) { // looping over hashmap keys and values
            Student studentInfo = stud.getValue();
            System.out.println(
                    "Name: " +  studentInfo.getName() +
                            "\nUsername: " +  studentInfo.getUserName() +
                            "\nGrades: " + studentInfo.getGrades() +
                            "\nAverage: " + Math.round(studentInfo.getGradeAverage()) +
                            "\n------------------------------------------");
        }
        ExitProgram.exitProgram(entries);
    }
}
