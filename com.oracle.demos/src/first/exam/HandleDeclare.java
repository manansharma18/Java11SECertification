package first.exam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HandleDeclare {

    //static var count = 0;
    public static void main(String[] args) throws Exception {
        eat();

        eatUnchecked();
        float a= 5>7? 2:3.0f;
        short aa =6;
        int x = 7;
        float b = 2>10? (aa =6):( x = 7);
    }

    static void eat() throws IOException, FileNotFoundException,Exception {
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
    static void eatUncheckedChecked() throws ArithmeticException {

        try{
            new IOException();
        }catch (Exception e){
            throw e;
        }


    }
}
