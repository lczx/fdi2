package history.model.filter;

public interface Predicate<T> {

    boolean run(T arg);

}
