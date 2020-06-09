package lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateOverride implements Overriden<Integer> {

    public static void main(String[] args) {
        PredicateOverride predicateOverride = new PredicateOverride();
        System.out.println(predicateOverride.test(new Integer(1)));
        predicateOverride.lambdaMethod(5,"Hello");
        predicateOverride.curlyBraces("Manan","Man");
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

    public void curlyBraces(final String a,final String b){
        System.out.println();
        LocalPredicate<String> stringPredicate = (aa,bb)-> {return a.startsWith(b);};
        LocalPredicate<String> stringPredicate1 = (aa,bb)-> {
            String c = "Sharma";
            String d = "Waterloo";
            return a.startsWith(b);
        };
        String aa= "";
        String c= "";//Can use lambda variables outside lambda
        System.out.println(stringPredicate.test(a,b));
        Supplier<Integer> supplier =() -> {
            System.out.println("hey");
            return 6;};
    }
    interface LocalPredicate<T> {
        boolean test(T t,T t1);
    }
}
