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

        List<Integer> freshness  = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //To mix a cocktail, you have to take the first bucket
        // of ingredients and the last freshness level value.


        int firstIndexOfIngredients = 0;
        int lastIndexOfFreshness = freshness.size() - 1;



        int mix = 0;

        while (!ingredients.isEmpty() && !freshness.isEmpty()){

            Integer firstIngredient = ingredients.get(firstIndexOfIngredients);
            Integer lastFreshness = freshness.get(lastIndexOfFreshness);
            int mixture = firstIngredient * lastFreshness;
            boolean successfullyMixed = false;
            //Pear Sour	- 150
            //The Harvest - 250
            //Apple Hinny - 300
            //High Fashion - 400
            switch (mixture){

                case 150:
                    break;

                case 250:
                    break;

                case 300:
                    break;

                case 400:
                    break;
            }

        }
    }
}
