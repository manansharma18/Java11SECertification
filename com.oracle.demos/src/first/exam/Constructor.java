package first.exam;

public class Constructor {

    public Constructor(int a){
        System.out.println("Int");
    }


    public static void main(String[] args) {
        new Constructor(new Integer(1));
    }
}
