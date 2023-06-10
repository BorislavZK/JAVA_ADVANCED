package ExamPreparation;
import java.util.*;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> liquids = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> ingredients = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int firstLiquidIndex = 0;
        int lastIngredientInd = ingredients.size() - 1;

        int biscuitCnt = 0;
        int cakeCnt = 0;
        int pastryCnt = 0;
        int pieCnt = 0;

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {

            int sum = 0;


            Integer firstLiquid = liquids.get(firstLiquidIndex);

            Integer lastIngredient = ingredients.get(lastIngredientInd);

            sum = firstLiquid + lastIngredient;
            boolean successfullyCooked = false;
            switch (sum) {
                case 25:
                    biscuitCnt++;
                    successfullyCooked = true;
                    break;
                case 50:
                    cakeCnt++;
                    successfullyCooked = true;
                    break;
                case 75:
                    pastryCnt++;
                    successfullyCooked = true;
                    break;
                case 100:
                    pieCnt++;
                    successfullyCooked = true;
                    break;
            }

            liquids.remove(firstLiquidIndex);
            if (successfullyCooked) {
                ingredients.remove(lastIngredientInd);
                lastIngredientInd--;
            } else {
                ingredients.set(lastIngredientInd, lastIngredient + 3);
            }
        }


        if (biscuitCnt >= 1 && cakeCnt >= 1 && pastryCnt >= 1 && pieCnt >= 1) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        System.out.print("Liquids left: ");
        if (liquids.isEmpty()) {
            System.out.println("none");
        } else {
            List<String> liquidsForPrint = liquids
                    .stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            System.out.println(String.join(", ", liquidsForPrint));
        }

        System.out.print("Ingredients left: ");
        if (ingredients.isEmpty()) {
            System.out.println("none");
        } else {
            Collections.reverse(ingredients);

            List<String> ingredientsForPrint = ingredients.stream()
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            System.out.println(String.join(", ", ingredientsForPrint));
        }

        System.out.println("Biscuit: " + biscuitCnt);
        System.out.println("Cake: " + cakeCnt);
        System.out.println("Pie: " + pieCnt);
        System.out.println("Pastry: " + pastryCnt);

    }
}