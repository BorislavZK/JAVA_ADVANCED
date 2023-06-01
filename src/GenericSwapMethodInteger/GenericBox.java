package GenericSwapMethodInteger;

public class GenericBox<T extends Comparable<T>> {

    private T value;

    public GenericBox(T value) {
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
