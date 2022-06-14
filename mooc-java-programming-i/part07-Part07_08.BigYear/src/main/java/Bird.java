public class Bird {
    private String name;
    private String nameLatin;
    private int observations; 

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }

    public void addObservation() {
        this.observations += 1;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.nameLatin + "): " + this.observations + "observations";
    }
}
