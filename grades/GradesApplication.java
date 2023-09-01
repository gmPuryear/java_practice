package grades;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {
    public static final Scanner scanner = new Scanner(System.in); // global scanner

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        LoadStockUsers.loadStockUsers(students);
        UserSelection.userSelection(students);


//        addStudent.loadStockUsers(students);
//        addStudent.addStudent(students);

//        addStudent.addStudent(students);

//        Student Sanders = new Student("Berry Sanders");
//        Sanders.addGrade(100);
//        Sanders.addGrade(65);
//        Sanders.addGrade(87);
//
//
//        Student Aaron = new Student("Hank Aaron");
//        Aaron.addGrade(85);
//        Aaron.addGrade(74);
//        Aaron.addGrade(69);
//
//
//        Student Williams = new Student("Hank Williams");
//        Williams.addGrade(90);
//        Williams.addGrade(91);
//        Williams.addGrade(82);
//
//        Student Fields = new Student("Sally Fields");
//        Fields.addGrade(99);
//        Fields.addGrade(91);
//        Fields.addGrade(94);
//
//        students.put("TheSandersMan".toLowerCase(), Sanders);
//        students.put("AaronTheGreat".toLowerCase(), Aaron);
//        students.put("SirWilliamsWill".toLowerCase(), Williams);
//        students.put("SallyOfFields".toLowerCase(),Fields);
//
//        System.out.println(Fields.getGrades());
//        for (String username : students.keySet()) {
//            System.out.println(username);
//        }
//        System.out.print("\nPlease enter a GitHub username to see more information: ");
//
//        Scanner scanner = new Scanner(System.in);
//      String usernameSelection = scanner.nextLine().toLowerCase();
//        System.out.println(usernameSelection);
////
//        System.out.println((students.containsKey(usernameSelection)));
//
//        if (students.containsKey(usernameSelection)) {
//            Student user = students.get(usernameSelection);
//            System.out.println(user.getName());
//            System.out.println(user.getGrades());
//        }


    }
}
