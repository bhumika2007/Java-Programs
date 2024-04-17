package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("New File.txt");
        if (file.exists() == false) {
            try {
                file.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println("read line " + scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append("\nThis is new line");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
