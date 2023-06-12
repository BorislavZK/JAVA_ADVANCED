package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AutumnCocktails {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        List<Integer> ingredients = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> freshness = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //To mix a cocktail, you have to take the first bucket
        // of ingredients and the last freshness level value.

        int firstIndexOfIngredients = 0;
        int lastIndexOfFreshness = freshness.size() - 1;

        int pearSour = 0;
        int theHarvest = 0;
        int appleHinny = 0;
        int highFashion = 0;

        int mix = 0;

        while (!ingredients.isEmpty() && !freshness.isEmpty()) {

            Integer firstIngredient = ingredients.get(firstIndexOfIngredients);
            Integer lastFreshness = freshness.get(lastIndexOfFreshness);
            int mixture = firstIngredient * lastFreshness;
            boolean successfullyMixed = false;

            switch (mixture) {
                case 150:
                    //Pear Sour	- 150
                    pearSour++;
                    successfullyMixed = true;
                    break;

                case 250:
                    //The Harvest - 250
                    theHarvest++;
                    successfullyMixed = true;
                    break;

                case 300:
                    //Apple Hinny - 300
                    appleHinny++;
                    successfullyMixed = true;
                    break;

                case 400:
                    //High Fashion - 400
                    highFashion++;
                    successfullyMixed = true;
                    break;
            }

            freshness.remove(lastIndexOfFreshness);
            lastIndexOfFreshness--;

            for (int i = 0; i < ingredients.size(); i++) {
                if (ingredients.get(i) == 0) {
                    ingredients.remove(i);
                    i--;
                }
            }

            if (successfullyMixed) {
                ingredients.remove(firstIndexOfIngredients);
            } else {
                int elementPlus5 = ingredients.get(firstIndexOfIngredients) + 5;
                ingredients.remove(0);
                ingredients.add(elementPlus5);
            }
        }
        if (pearSour >= 1 && theHarvest >= 1 && appleHinny >= 1 && highFashion >= 1) {
            System.out.println("It's party time! The cocktails are ready!");
            int ingredientsSum = 0;
            if (!ingredients.isEmpty()){
                for (int i = 0; i < ingredients.size(); i++) {
                    ingredientsSum += ingredients.get(i);
                }
                System.out.println("Ingredients left: " + ingredientsSum);
            }
            System.out.println("# Apple Hinny --> " + appleHinny);
            System.out.println("# High Fashion --> " + highFashion);
            System.out.println("# Pear Sour --> " + pearSour);
            System.out.println("# The Harvest --> " + theHarvest);
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            int ingredientsSum = 0;
            if (!ingredients.isEmpty()){
                for (int i = 0; i < ingredients.size(); i++) {
                    ingredientsSum += ingredients.get(i);
                }
                System.out.println("Ingredients left: " + ingredientsSum);
            }
            if (appleHinny > 0 ){
                System.out.println("# Apple Hinny --> " + appleHinny);
            }

            if (highFashion > 0){
                System.out.println("# High Fashion --> " + highFashion);
            }

            if (pearSour > 0){
                System.out.println("# Pear Sour --> " + pearSour);
            }

            if (theHarvest > 0){
                System.out.println("# The Harvest --> " + theHarvest);
            }
        }
    }
}
