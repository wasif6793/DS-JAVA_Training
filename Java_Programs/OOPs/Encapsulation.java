package Java_Programs.OOPs;


// It is data binding using method.
public class Encapsulation {
    public static void main(String[] args) {

        // to print the trainer profile.

        Trainers trainer = new Trainers();
        trainer.name = "Pawan Sir";
        trainer.email = "pawan@gmail.com";
        trainer.technology = "Java.";

        System.out.println();

        // Using method where assigning value here.

        System.out.println("My trainer name is " + trainer.name + " whose email ID is " + trainer.email + " and the technology he is using is " + trainer.technology);

        // Using method in it

        System.out.println();
        System.out.println(trainer.printprofile("Pawan Sir","pawan@gmail.com","Java"));

        // Using getter and setter

        trainer.setEmail("abc@gmail.com");
        trainer.setTechnology("Java");
        trainer.setName("Pawan Sir");

        System.out.println("My trainer name is " + trainer.getName() + " whose email ID is " + trainer.getEmail() + " and the technology he is using is " + trainer.getTechnology());

    }
}

class Trainers{

    String name;
    String email;
    String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    static String  printprofile(String name, String email, String technology){
        String val = "My trainer name is " + name + " whose email ID is " +email + " and the technology he is using is " + technology;
        return val;

    }

}


