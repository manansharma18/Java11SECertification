import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchException {

    private String text;

    /*static {
        int[] arra = new int[3];
        System.out.println(arra[3]);
    }
*/
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void fall(int x) throws Exception,IOException,FileNotFoundException,NullPointerException {
        throw new Exception();
    }

    void fall() {
        throw new IllegalArgumentException();
    }
        public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        TryCatchException tryCatchException = new TryCatchException();
        TryCatchException.Dummy  dummy = tryCatchException.new Dummy();
        dummy.print();
        try{
             fileInputStream = new FileInputStream("abc.txt");

        }
        catch (NullPointerException | FileNotFoundException | SecurityException e){
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

    private class Dummy{

        void print(){
            System.out.println(text);
        }

    }
}
