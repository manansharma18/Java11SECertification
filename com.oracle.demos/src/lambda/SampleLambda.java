package lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Integer.compare;

public class SampleLambda {

    public static void main(String[] args) {

        Employee john = new Employee(25, "Manan");
        Employee cena = new Employee(20, "cena");
        Employee doe = new Employee(30, "doe");
        Employee cannon = new Employee(50, "cannon");

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(cena);
        employees.add(doe);
        employees.add(cannon);
        Collections.sort(employees, (employee1, employee2) -> {
            return compare(employee1.getAge(), employee2.getAge());
        });

        getOldOrYoung(employee -> employee.getAge() > 30,employees,"More than 30 years old");
        getOldOrYoung(employee -> employee.getAge()<=30,employees,"Less than equal to 30");

        IntPredicate greaterThan10 = i -> i>10;
        IntPredicate lessThan100 = i -> i < 100;

        System.out.println("=========================");

        System.out.println(greaterThan10.test(5));
        System.out.println(greaterThan10.test(25));
        System.out.println(lessThan100.test(50));
        System.out.println(lessThan100.test(110));
        System.out.println(greaterThan10.and(lessThan100).test(80));
        System.out.println(lessThan100.and(greaterThan10).test(45));

        Random random = new Random();
        Supplier<Integer> randomSupplier = ()->random.nextInt(1000);
        for (int i=0;i<5;i++){
            System.out.println(randomSupplier.get());
        }
    }

    public static void getOldOrYoung(Predicate<Employee> ageCondition, List<Employee> employees,String text){
        System.out.println(text);
        System.out.println("=========================");
        for (Employee employee : employees){
        if (ageCondition.test(employee)){
            System.out.println(employee.getName());
            //return employee.getAge();
        }

        }
    }
}