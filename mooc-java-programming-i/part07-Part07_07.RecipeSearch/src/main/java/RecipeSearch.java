import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String path = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(path))) {
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        RecipeList recipes = new RecipeList();
        int i = 0;
        while (i < list.size()) {
            String name = list.get(i);
            int cookingTime = Integer.valueOf(list.get(i + 1));
            int subIndex = i + 2;
            ArrayList<String> ingredients = new ArrayList<>();
            while (!list.get(subIndex).equals("") && subIndex != list.size() - 1) {
                ingredients.add(list.get(subIndex));
                subIndex += 1;
            }
            recipes.add(new Recipe(name, cookingTime, ingredients));
            i = subIndex + 1;
        }

        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            } else if(command.equals("list")){
                recipes.list();
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = scanner.nextLine();
                System.out.println("Recipes:\n" + recipes.findByName(name));
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:\n" + recipes.findByCookingTime(cookingTime));
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:\n" + recipes.findIngredient(ingredient));
            }
        }
    }
}
