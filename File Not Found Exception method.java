// File Not Found Exception method

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileInputStream fis = new FileInputStream(file); // Trying to open a nonexistent file
        } catch (FileNotFoundException e) {
            System.out.println("A file not found exception occurred: " + e.getMessage());
        }
    }
}