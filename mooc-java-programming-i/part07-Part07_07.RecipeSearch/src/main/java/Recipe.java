import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
