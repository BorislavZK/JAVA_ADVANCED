package GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> values;

    public Box() {
        values = new ArrayList<>();
    }


  //  @Override
  //  public String toString() {
  //      return value.getClass().getName() + ": " +  value;
  //  }

    public void add(T element) {
        values.add(element);
    }

    public long countGreaterItems(T element) {
        return values.stream().filter(item -> item.compareTo(element) > 0).count();
    }



}
