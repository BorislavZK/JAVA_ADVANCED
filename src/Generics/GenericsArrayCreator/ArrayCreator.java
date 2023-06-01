package Generics.GenericsArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator<T> {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        Arrays.fill(array, item);
        return array;
    }

    public static <T> T[] create(Class<T> classType, int length, T item) {
        T[] arr = (T[]) Array.newInstance(classType, length);
        Arrays.fill(arr, item);
        return arr;
    }
}