package lambda;

import java.util.Random;
import java.util.function.Supplier;

public class PractiseLambda {

    public static void main(String[] args) {

        Random random = new Random();
        LambdaInterface lambdaInterface = (int a)-> a*2;
        LambdaInterface lambdaInterface1 = (j)-> (int) (j*2.0);
        System.out.println(lambdaInterface.multiplyByTwo(5));
        System.out.println(lambdaInterface1.multiplyByTwo(5));
        Supplier<Integer> supplier = () ->random.nextInt(1000);
        for (int i =0;i<5;i++) System.out.println(supplier.get());
    }


}

interface LambdaInterface{
    int multiplyByTwo(int i);
}
