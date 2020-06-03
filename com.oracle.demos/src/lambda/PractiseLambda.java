package lambda;

import java.util.function.Supplier;

public class PractiseLambda {

    public static void main(String[] args) {

        LambdaInterface lambdaInterface = (int a)-> a*2;
        LambdaInterface lambdaInterface1 = (j)-> (int) (j*2.0);
        System.out.println(lambdaInterface.multiplyByTwo(5));
        System.out.println(lambdaInterface1.multiplyByTwo(5));

    }


}

interface LambdaInterface{
    int multiplyByTwo(int i);
}
