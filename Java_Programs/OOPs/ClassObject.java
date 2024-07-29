package Java_Programs.OOPs;

import java.util.Scanner;

public class ClassObject {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Trainer trainer = new Trainer();
        trainer.trainerName = "Pawan Sir";

        System.out.println("Trainer name is " + trainer.trainerName );
        System.out.print("Write student name here: ");

        Student stu = new Student();
        stu.studentName = sc.nextLine();

        System.out.println("Trainer name is " + trainer.trainerName + " and student name is " + stu.studentName);

        trainer.printtrainerProfile("Pawan Sir","Java");

        System.out.println();

        System.out.print("Enter no. of days: ");
        trainer.noDays(sc.nextInt());
    }
}

class Trainer{
    String trainerName;
    String trainerTechnology;

    void printtrainerProfile(String name, String technology) {
        System.out.println("Using method: " +name + " " + technology);
    }
    void noDays(int num) {
        System.out.println("Number of days completed: " + num);
    }
}

class Student {
    String studentName;
    String studentTechnology;
}

