package grades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

// Use "BufferedWrier class which can write to multiple different things but we are just doing a txt file
// Create new BuggerWriter object
// create String variables to hold the directory name and filename that you want to check for
// get the directory via name and the file by name
// Check if file already exists. If not, create file in the root directory (current director)
//
public class FileHelper {

    public static void writeToFile() {
        BufferedWriter fileWriter;
        Student student = new Student("frank man", "manfrank");
        {
            // Using try catch block because FileWriter may throw a IOexception which is unhandled without a try catch
            try {
                // if the "studentInfo.txt already exists, it will not make another file. Instead it will overwrite the existing one
                // file is made in root project directory (relative path) So for this it would be (java_practice)
                fileWriter = new BufferedWriter(new FileWriter("studentInfo.txt"));
                fileWriter.write("hello you people");
                fileWriter.write("\nthis was added to the file");
                fileWriter.close(); // must close writer or else nothing will be writen to file
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
