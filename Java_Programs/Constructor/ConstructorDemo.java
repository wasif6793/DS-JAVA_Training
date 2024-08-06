package Java_Programs.Constructor;

import org.w3c.dom.ls.LSOutput;

public class ConstructorDemo {
    public static void main(String[] args) {

        //Call the constructor object
        MyClass myClass = new MyClass(2,3);
        System.out.println("c" + myClass.c);
        System.out.println("d " + myClass.d);
        System.out.println();
        CallConstructor callName = new CallConstructor("Mohammad ","Wasif");
        //CallConstructor call = new CallConstructor(a,b);


    }
}

class MyClass{
    int c,d;

    //parameter constructor
    public MyClass(int a,int b){
        this.c = a;
        this.d =b;
        System.out.println(c + d);
    }
}

class CallConstructor{
    String a, b;

    public CallConstructor(String c, String d){
        this.a = c;
        this.b = d;
        System.out.println(a+b);
    }
}
