package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    CustomList<String> list = new CustomList<String>();

    while (!input.equals("END")){
        String[] data = input.split("\\s+");
        switch (data[0]){

            case "Add":
                list.add(data[1]);
                break;
            case "Remove":
                list.remove(Integer.parseInt(data[1]));
                break;
            case "Contains":
                System.out.println(list.contains(data[1]));
                break;
            case "Swap":
                int index1 = Integer.parseInt(data[1]);
                int index2 = Integer.parseInt(data[2]);
                list.swap(index1, index2);

        }

    }



    }
}
