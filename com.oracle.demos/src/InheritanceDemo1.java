public class InheritanceDemo1 extends Parent {

    public InheritanceDemo1() {
        this(4);
    }

    public InheritanceDemo1(int number) {
        super(4);
    }

    public static void main(String[] args) {

    }
    public void run(){
        System.out.println("A");
    }
}

class Parent{
    public Parent(int number){
        System.out.println("E");
    }

    public Parent() {
    }
}
