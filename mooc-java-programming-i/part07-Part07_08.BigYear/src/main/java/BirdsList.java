import java.util.ArrayList;

public class BirdsList {
    private ArrayList<Bird> birds;

    public BirdsList() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birds.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }

    public String one(String name) {
        String str = "";
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                str = bird.toString();
            }
        }
        return str;
    }

    public void all() {
        for (Bird bird : this.birds) {
            System.out.println(bird.toString());
        }
    }
}
