package SetAndMaps;
import java.util.*;
import java.util.stream.Collectors;
public class _08_L_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1)).limit(3).collect(Collectors.toList());
        System.out.println(nums.toString().replaceAll("[\\[\\],]",  "").trim());
    }
}