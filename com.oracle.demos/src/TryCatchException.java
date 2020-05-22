import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchException {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        TryCatchException tryCatchException = new TryCatchException();
        TryCatchException.Dummy  dummy = tryCatchException.new Dummy();
        try{
             fileInputStream = new FileInputStream("abc.txt");

        }
        catch (FileNotFoundException | SecurityException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("hi ");
                if (fileInputStream !=null && dummy != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                }
        }
    }

    private class Dummy extends Exception{

        public Dummy() {
        }
    }
}
