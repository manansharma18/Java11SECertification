package lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PractiseLambda {

    public static void main(String[] args) {

        Random random = new Random();
        LambdaInterface lambdaInterface = (int a)-> a*2;
        LambdaInterface lambdaInterface1 = (j)-> (int) (j*2.0);
        System.out.println(lambdaInterface.multiplyByTwo(5));
        System.out.println(lambdaInterface1.multiplyByTwo(5));
        Supplier<Integer> supplier = () ->random.nextInt(1000);
        Consumer<String> stringConsumer =  a -> System.out.println(a.toUpperCase());
        Supplier s = ()->5; //non generic type
        Consumer c = (var x) -> x.toString();// x is object
        stringConsumer.accept("Dummies");
        for (int i =0;i<5;i++) System.out.println(supplier.get());
        MathsOperations addition = (int a , int b) -> a+b;
        MathsOperations multiplication = (int a, int b) -> a*b;

        if(new PractiseLambda() instanceof LambdaInterface){
            System.out.println("Instance of true");
        }
        else
            System.out.println("Not instance of");

        System.out.println(addition.operations(5,7));
        System.out.println(multiplication.operations(5,4));

        PractiseLambda practiseLambda = new PractiseLambda();
        PractiseLambda.Inner innerClass = practiseLambda.new Inner();
        System.out.println(innerClass.reduction(8,16));

    }
    private class Inner implements MathsOperations{
        @Override
        public int operations(int a, int b) {
            return a +b;
        }
        public int reduction(int a, int b){
            return a/b;
        }
    }


}
@FunctionalInterface
interface LambdaInterface{
    int multiplyByTwo(int i);
    static void nonAbstract(){
        System.out.println("In non abstract");
    }
}
@FunctionalInterface
interface MathsOperations {
    int operations(int a, int b);
    default int reduction(int a,int b){return -1; }

}


