import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static int a = 4;
    public int b = 2;
    public void m1(){
        System.out.println("No arg");
    }
    public void m1(int a){
        System.out.println("int is " +a);
    }
    public List<String> genericOverrideWithParameters(List<String> list)
    {
        return new ArrayList<String>();
    }
    public Iterable<String> genericOverride(){
        return new ArrayList<String>(10);
    }
}
