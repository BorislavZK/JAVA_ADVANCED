package GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<GenericBox<Integer>> boxes = new ArrayList<>();
        while (n-- > 0 ){
            Integer box = Integer.parseInt(scan.nextLine());
            boxes.add(new GenericBox<>(box));
        }
        String[] tokes = scan.nextLine().split("\\s+");
        int index1 = Integer.parseInt(tokes[0]);
        int index2 = Integer.parseInt(tokes[1]);
        swap(boxes, index1, index2);
        boxes.forEach(System.out::println);

    }

    public static <T> void swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
