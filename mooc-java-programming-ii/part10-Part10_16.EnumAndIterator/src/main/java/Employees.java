import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    List<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public void add(List<Person> people) {
        people.stream().forEach(person -> {
            this.people.add(person);
        });
    }
    
    public void print() {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person.toString());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}