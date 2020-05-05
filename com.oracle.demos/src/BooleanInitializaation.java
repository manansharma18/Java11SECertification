public class BooleanInitializaation {

    public static void main(String[] args) {
        boolean check = false;
        var booleanInitalizer = new BooleanInitializaation();
        booleanInitalizer.check(check);
    }

    public void check(boolean check){
        if(check){
            System.out.println("True check");
        }
        else{
            System.out.println("False check");
        }
    }
}
