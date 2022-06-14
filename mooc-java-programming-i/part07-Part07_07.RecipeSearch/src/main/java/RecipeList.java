import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void list() {
        System.out.println(this);
    }

    public String findByName(String name) {
        String str = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                str += recipe.toString() + "\n";
            }
        }
        return str;
    }
    
    public String findByCookingTime(int cookingTime) {
        String str = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                str += recipe.toString() + "\n";
            }
        }
        return str;
    }

    public String findIngredient(String ingredient) {
        String str = "";
        for (Recipe recipe : this.recipes) {
            for (String string : recipe.ingredients) {
                if (ingredient.equals(string)) {
                    str += recipe.toString() + "\n";
                }
            }
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "";
        for (Recipe recipe : this.recipes) {
            str += recipe + "\n";
        }
        return "Recipes:\n" + str;
    }
}
