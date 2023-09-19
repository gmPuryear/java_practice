package grades.choices;

import grades.Student;
import grades.UserSelection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static grades.GradesApplication.scanner;

public class ExitProgram {

    public static void exitProgram() {
        System.out.println("Would you like to do anything else (y/n)?");
        String exitProgram = scanner.nextLine();
        if (exitProgram.equalsIgnoreCase("y")) {
            UserSelection.userSelection();
        } else {
            System.out.print("Good bye!");
            System.exit(0);
        }
    }
}
