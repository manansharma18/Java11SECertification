import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {

        System.out.println(exceptions());

        try {
            int[] arra = new int[3];
            System.out.println(arra[3]);
            playWithException();
            throw new IOException();
        }catch (FileNotFoundException e){}
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally run");
        }
    }

    static void  playWithException() throws IOException{
        try{
            throw new RuntimeException();
        }
        catch (RuntimeException r){

            throw new RuntimeException();
        }
        finally {
            throw new IOException();
        }
    }
    public static String exceptions() {
        StringBuilder result = new StringBuilder(); String v = null;
        try {
            try { result.append("before_");
                v.length();
                result.append("after_");
            } catch (NullPointerException e) {
                result.append("catch_");
                throw new RuntimeException();
            } finally {
                result.append("finally_");
                return "inner finally";
            //throw new Exception();

            }
        } catch (Exception e) {
            result.append("done"); }
        finally {
            System.out.println(result.toString());
            return "outer finally";
        }
        //return result.toString(); }
}
}
