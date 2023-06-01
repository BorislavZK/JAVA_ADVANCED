package GenericBoxOfInteger;

public class GenericBoxOfIntegers<T extends Comparable<T>> {

    private T value;

    public GenericBoxOfIntegers(T value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value.getClass().getName() + ": " +  value;
    }

    public T getValue() {
        return value;
    }
}
