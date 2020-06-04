package lambda;

import java.util.function.Predicate;

public class PredicateOverride implements Overriden<Integer> {

    public static void main(String[] args) {
        PredicateOverride predicateOverride = new PredicateOverride();
        System.out.println(predicateOverride.test(new Integer(1)));
        predicateOverride.lambdaMethod(5,"Hello");
    }

    public void lambdaMethod(int a,String b){

        Predicate<Integer> integerPredicate = aa -> {
            System.out.println(aa);
            System.out.println(a);
            return a>20;};
        Predicate<String> stringPredicate = bb ->{
            System.out.println(b);
            System.out.println(bb);
            return b.isEmpty();};
        System.out.println(integerPredicate.test(14));
        System.out.println(stringPredicate.test(" "));

    }
}
