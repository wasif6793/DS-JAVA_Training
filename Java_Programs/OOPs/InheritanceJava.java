package Java_Programs.OOPs;

public class InheritanceJava {

    String t = "null abs";



    public static void main(String[] args) {
        Name nama = new Name();
        String n = nama.naam;;
        System.out.println(n);
    }

    static class Name extends InheritanceJava{

        String naam = t;


    }
}
