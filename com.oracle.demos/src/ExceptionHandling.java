import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            m1(9);
            throw new Exception("This is exception");
            //m2();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

     static void m1 (int x) throws CheckedExceptionHandling,IOException{

        if (x>8) throw new IOException("IOException ");
        throw new CheckedExceptionHandling("checked exception");

    }
    static void m2 () {
        throw new UncheckedExceptionHandling("Unchecked Excpetions");
    }

    static {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Errors | Exception e){}
    }

}
class UncheckedExceptionHandling extends RuntimeException{

    public UncheckedExceptionHandling(String message) {
        super(message);
    }
}

class CheckedExceptionHandling extends Exception{
    public CheckedExceptionHandling(String message) {
        super(message);
    }
}
