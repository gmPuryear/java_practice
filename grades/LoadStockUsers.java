package grades;

import java.util.HashMap;

public class LoadStockUsers {
//    Just used to populate the hashmap with some random users
    public static void loadStockUsers(HashMap students) {
        Student Sanders = new Student("Berry Sanders", "SandersBerry", students);
        Sanders.addGrade(100);
        Sanders.addGrade(65);
        Sanders.addGrade(87);


        Student Aaron = new Student("Hank Aaron", "AaronHank", students);
        Aaron.addGrade(85);
        Aaron.addGrade(74);
        Aaron.addGrade(69);


        Student Williams = new Student("Hank Williams", "WilliamsHank", students);
        Williams.addGrade(90);
        Williams.addGrade(91);
        Williams.addGrade(82);

        Student Fields = new Student("Sally Fields", "FieldsSally", students);
        Fields.addGrade(99);
        Fields.addGrade(91);
        Fields.addGrade(94);

        students.put(Sanders.getName(), Sanders);
        students.put(Aaron.getName().toLowerCase(), Aaron);
        students.put(Williams.getName().toLowerCase(), Williams);
        students.put(Fields.getName().toLowerCase(),Fields);
    }
}
