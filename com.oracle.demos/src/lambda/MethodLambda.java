package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class MethodLambda {

    public static void main(String[] args) {
        //int i;
        IntPredicate greaterThan15Flag = i -> i >15;
        Employee john = new Employee(25, "Manan");
        Employee cena = new Employee(20, "cena");
        Employee doe = new Employee(30, "doe");
        Employee cannon = new Employee(50, "cannon");

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(cena);
        employees.add(doe);
        employees.add(cannon);

        print(employee -> employees.get(0).getAge(),25);
    }

    public static void print(Consumer<Integer> name, int x){
        //System.out.println(name);
        name.accept(x);
    }
}
