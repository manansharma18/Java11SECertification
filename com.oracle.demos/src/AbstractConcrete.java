import java.util.ArrayList;
import java.util.List;

public class AbstractConcrete extends ExtendsConcreteAbstract{

    public AbstractConcrete(){
        super();
        System.out.println("AbstractConcrete");
    }
    void getDetails(){
        System.out.println("Hello");
        //super.getDetails();
    }
    int concrete(){
        return 4;
    }
    public static void main(String[] args) {
        AbstractConcrete abstractConcrete = new AbstractConcrete();
        ConcreteAbstract concreteAbstract = abstractConcrete;
        ExtendsConcreteAbstract extendsConcreteAbstract = abstractConcrete;
        concreteAbstract.getDetails();
        abstractConcrete.getDetails();
        System.out.println(abstractConcrete.concrete());
        System.out.println(concreteAbstract.concrete());
        System.out.println(extendsConcreteAbstract.concrete());
        extendsConcreteAbstract.getDetails();
        short s = (short)Integer.MAX_VALUE;
        System.out.println(s);
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>(); list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
        System.out.println(array);
    }
}
