package function_interface;

@FunctionalInterface
public interface FunInterface <T, I extends Number> {
    public T getFunc(T argument);

}