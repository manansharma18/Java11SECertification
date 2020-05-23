import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        try {
            int[] arra = new int[3];
            System.out.println(arra[3]);
            throw new IOException();
        }catch (FileNotFoundException e){}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
