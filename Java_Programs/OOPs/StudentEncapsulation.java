package Java_Programs.OOPs;

public class StudentEncapsulation extends Studentdetails{
    public static void main(String[] args) {

        Studentdetails stu = new Studentdetails();

        stu.setName("Wasif");
        stu.setEmail("abc@gmail.com");
        stu.setTechnology("Java");

        System.out.println();

        System.out.println("Student name is " + stu.getName()+ ", email ID is " + stu.getEmail()+" and technology learning is "+ stu.getTechnology());

    }
}

class Studentdetails{

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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    String name;
    String email;
    String technology;

}