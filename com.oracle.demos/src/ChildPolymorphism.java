import java.util.ArrayList;
import java.util.List;

public class ChildPolymorphism extends Polymorphism {

    public static int a = 8;
    public int b = 6;
    public void m1(){
        System.out.println("No arg Child");
    }
    public void m1(int a){
        System.out.println("Child int is " +a);
    }

    public List<String> genericOverride(){
        return new ArrayList<String>();
    }

    public Integer m2(){int a =5; return a;}

    public ArrayList<String> genericOverrideWithParameters(List<String> list)
    {
        return new ArrayList<String>();
    }


    public static void main(String[] args) {

        Polymorphism polymorphism = new ChildPolymorphism();
        ChildPolymorphism childPolymorphism = new ChildPolymorphism();
        polymorphism.m1();
        polymorphism.m1(6);
        childPolymorphism.m1();
        childPolymorphism.m1(10);
        System.out.println(childPolymorphism.m2());
        System.out.println(polymorphism.genericOverride());
        System.out.println(childPolymorphism.genericOverride().size());
        System.out.println(polymorphism.a);
        System.out.println(childPolymorphism.a);
        System.out.println(polymorphism.b);
        System.out.println(childPolymorphism.b);
        System.out.println(childPolymorphism.genericOverrideWithParameters(new ArrayList<>()));
        System.out.println(polymorphism.genericOverrideWithParameters(new ArrayList<>()));

    }
}
