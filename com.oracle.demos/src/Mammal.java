import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mammal extends Animals implements HasTail{
public Integer m (String s){return 2;}
public void hasTail(){}

    public static void main(String[] args) {

        System.out.println(new Mammal().m(""));
        Animals animal = new Mammal();
        HasTail hasTail = new Mammal();

        List<Mammal> mammals = new ArrayList<>();
        mammals.add((Mammal) animal);
        mammals.add((Mammal) hasTail);
    }
}

class Animals{
    public Number m(CharSequence cs){return 1;}
}

interface HasTail{
    void hasTail();
}

