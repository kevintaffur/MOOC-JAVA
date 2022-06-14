import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        Person shortest = new Person("Test", 500);
        if (this.isEmpty()) {
            return null;
        } else {
            for (Person person : this.getPersons()) {
                if (person.getHeight() < shortest.getHeight()) {
                    shortest = person;
                }
            }
        }
        return shortest;
    }

    public Person take() {
        Person shortest = this.shortest();
        this.list.remove(shortest);
        return shortest;
    }
}
