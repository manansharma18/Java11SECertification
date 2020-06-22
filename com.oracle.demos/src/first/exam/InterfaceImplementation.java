package first.exam;

public class InterfaceImplementation implements A2,B2{
    public void d(){
        System.out.println("lol");
        A2.super.d();
        B2.super.d();

    }

    public static void main(String[] args) {
        InterfaceImplementation interfaceImplementation = new InterfaceImplementation();
        interfaceImplementation.d();
        interfaceImplementation.hello();
        String c = "";
        c+=false;



    }
}


interface A1{
    default void d(){
        System.out.println("hi");
    }
    default void hello(){
        System.out.println("hello");
    }
}

interface A2 extends A1{
}

interface B2{
    default void d(){
        System.out.println("hi b2");
    }
}
