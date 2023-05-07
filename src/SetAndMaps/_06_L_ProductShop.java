package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_L_ProductShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String input = scan.nextLine();
        while (!input.equals("Revision")){
            //lidl, peach, 1.20
            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            input = scan.nextLine();

        }

        shops.forEach((shopName, products) -> {
            System.out.println(shopName + "->");
            products.forEach((product, price) -> System.out.printf("Product: %s, Price: %.1f\n", product, price));
        });
    }
}
