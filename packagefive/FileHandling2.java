package packagefive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) {
        // create a new file..
        File myFile = new File("example.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }
        // code to write to a file..
        try {
            FileWriter fileWriter = new FileWriter("example.txt");
            fileWriter.write("This is our first file writer");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // reading a file
        File myfile = new File("example.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        // delete..

        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("i have deleted:" + file.getName());
        } else {
            System.out.println("some problem are occured file deleting the file");
        }
    }

}
