import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {


    public static void main(String[] args) {
        List<Integer> weights = new ArrayList<>();
        Integer w = 50;
        weights.add(w); // [50]
        weights.add(Integer.valueOf(60)); // [50, 60] 7: weights.remove(50); // [60]
        //weights.remove(50); Throws exception as 50 not an index in list.
        weights.remove(Integer.valueOf(60));
        double first = weights.get(0); // 60.0
        System.out.println(weights.toString());
    }
}


