package GenericCountMethodStrings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<GenericBox<String>> boxList = new ArrayList<>();
        while (n-- > 0){
            String input = scan.nextLine();
            boxList.add(new GenericBox<>(input));
        }
        GenericBox<String> target = new GenericBox<>(scan.nextLine());
    }
    public static <T extends Comparable<T>> int greaterThan(List<GenericBox<T>> list, GenericBox<T> val) {
        int numGreater = 0;
        for (GenericBox<T> element : list) {
            if (element.compareTo(val) > 0) {
                numGreater++;
            }
        }
        return numGreater;
    }
}
