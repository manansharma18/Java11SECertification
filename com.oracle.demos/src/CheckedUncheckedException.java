public class CheckedUncheckedException {

    public static void main(String[] args){
        //m2();
        try{
            m1();
            System.out.println("Before");
            m2();
            System.out.println("After");
        }
        catch (Unchecked | Checked u){
            System.out.println(u.getMessage());
        }

    }
    static void m1() throws Checked{
        throw new Checked("Checked exception");

    }
    static void m2() {
        throw new Unchecked("Unchecked exception");

    }
}

class Unchecked extends RuntimeException{

    public Unchecked(String message) {
        super(message);
    }
}

class Checked extends Exception{
    public Checked(String message) {
        super(message);
    }
}

class Errors extends java.lang.Error{}