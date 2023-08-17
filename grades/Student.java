package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades; // Arraylists must be contain objects which is why this one has "Integer"

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>(); // each time a new Student is created, the name is set and a new grade list for the student is made
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    public ArrayList getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

//     returns the average of the students grades
    public double getGradeAverage() {
        double gradeTotal = 0;
        for (int grade : grades) {
            gradeTotal += grade;
        }
        double gradeAverage = (gradeTotal % grades.size()) + (gradeTotal / grades.size());
        return gradeAverage;
    }

}
