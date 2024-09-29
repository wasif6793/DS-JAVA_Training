package Java_Programs.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilehandlingDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // File writing

        System.out.print("Enter file name: ");
        int i =5;
        String filename = sc.nextLine();
        System.out.println();
        System.out.print("Enter data: ");

        String data = sc.nextLine();
        try (FileWriter writer = new FileWriter(filename + ".csv")) {

            writer.write(data);
            writer.close();
            System.out.println("Successfully written");
        } catch (Exception e) {
            System.out.println(e);
        }

        // To read use this operation

        File myobj = new File(filename + ".csv");
        Scanner myReader = new Scanner(myobj);
        while (myReader.hasNextLine()){
            String readData = myReader.nextLine();
            System.out.println("My readable data is " + readData);
        }
        myReader.close();

    }

    /*
    try {
            FileWriter writer = new FileWriter("myfile.csv", true);
            System.out.println("write your friends name");
            Scanner scanner = new Scanner(System.in);
            writer.append(scanner.hasNextLine() + " ,");
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
     */

}
