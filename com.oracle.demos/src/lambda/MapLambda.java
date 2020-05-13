package lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapLambda {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Hello World");
        map.put(2,"Nice");
        map.put(3,"Hellp world");
        map.put(4,null);

        map.keySet().forEach(b-> System.out.println(b));
        map.values().forEach(b-> System.out.println(b));
        variables(5);
    }

    public static void variables(int a){
        int b =1;
        Predicate<Integer> p = c -> {
            int d = 0;
            return b==d;
        };
    }


}
