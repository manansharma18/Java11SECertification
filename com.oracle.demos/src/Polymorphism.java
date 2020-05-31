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
    public Integer m2(){int a =5; return a;}
    public List<String> genericOverrideWithParameters(List<Object> list)
    {
        return new ArrayList<String>();
    }
    public ArrayList<String> genericOverride(){
        return new ArrayList<String>(10);
    }
}
