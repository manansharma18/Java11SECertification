public class InheritanceDemo1 extends Parent {

    public InheritanceDemo1() {
        super(4);
    }

    public InheritanceDemo1(int number) {
        super(4);
    }

    public static void main(String[] args) {

    }
}

class Parent{
    public Parent(int number){
        System.out.println("E");
    }
}
