package Java_Programs.WrapperClasses;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 3;
        Integer b =5;

        // Benefit of using wrapper classes is they can be use methods aur janna hai to google krlo
        // Disadvantage is they use more space. memory zyada khaata hai jaise Integer wala kareeb 20-24 bytes kha jaata hai

        Integer c = a + b;
        System.out.println();
        System.out.println(c);
    }
}
