package first.exam;

import java.io.IOException;

public class HandleDeclare {

    public static void main(String[] args) {
        //eat();
        eatUnchecked();
    }

    static void eat() throws IOException {
        try{
            throw new IOException();
        }
        catch (IOException e){
            throw e;
        }
    }

    static void eatUnchecked() throws ArithmeticException {

        throw new RuntimeException();
    }

    static void eatUncheckedNotHandled(){

        throw new RuntimeException();
    }

}
