import java.util.ArrayList;
import java.util.List;

public class GenericOverloading extends Generics{
    public void gen(List<String> lists){}
//public void gen(List<Integer> lists){}
    public static void main(String[] args) {

        GenericOverloading genericOverloading = new GenericOverloading();
       /* List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);*/
        List<String> lists = new ArrayList<>();
        lists.add("hello");
      //  genericOverloading.gen(integers);
        genericOverloading.gen(lists);
    }
    public void run(){}
}

class Generics{

    public void gen(List<String> lists){}
   // public void gen(List<Integer> lists){}
    public void run(){}
}
