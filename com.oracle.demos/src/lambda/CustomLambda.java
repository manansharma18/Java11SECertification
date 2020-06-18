package lambda;

import java.util.function.Consumer;

public class CustomLambda {
    private String s;  // lambda can use instance variable
    public static void main(String[] args) {
        lambda lambda1 = (String s1, String s2) ->{
            return s1.toUpperCase().concat(s2.toUpperCase());};
        System.out.println(lambda1.concat("h1","hello"));

        lambda lambda2 = (String s1, String s2) ->{
            return s1.toLowerCase().concat(s2.toLowerCase());};

        System.out.println(lambda2.concat("h1","hello"));

        Consumer<String> str = s -> {
            System.out.println(s+"hello");
        };
        str.accept("bye");
    }


}

@FunctionalInterface
interface lambda{
    String concat(String s,String s1);
}
