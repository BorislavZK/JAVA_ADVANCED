package CustomList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable<T> > {
    protected List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public boolean contains(T item){
        return list.contains(item);
    }



    public void swap(int index1, int index2) {
        swap(list, index1, index2);
    }

    // защо не мога да ползвам този swap в main-a?
    public static <T> void swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


    public static <T extends Comparable<T>> int greaterThan(List<T> list, T val) {
        int numGreater = 0;
        for (T element : list) {
            if (element.compareTo(val) > 0) {
                numGreater++;
            }
        }
        return numGreater;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return list.stream()
                .min(Comparable::compareTo)
                .get();
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return list.stream()
                .max(Comparable::compareTo)
                .get();
    }

    public void printAll() {
        list.forEach(System.out::println);
    }

    public void sort() {
        list = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }


}
