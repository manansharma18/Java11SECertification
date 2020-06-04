package lambda;

import java.util.function.Predicate;

public interface Overriden <T> extends Predicate<T> {
    default boolean test(T t){ return true;}// Predicate test is overriden here
}
