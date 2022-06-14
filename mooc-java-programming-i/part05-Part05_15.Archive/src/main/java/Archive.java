public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive archive = (Archive) compared;

        if (this.identifier.equals(archive.identifier)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
