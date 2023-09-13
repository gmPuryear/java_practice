package grades;

import java.util.*;

public class GradesApplication {

    public static final Scanner scanner = new Scanner(System.in); // global scanner
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        LoadStockUsers.loadStockUsers(students);
        UserSelection.userSelection(students);
    }
}
