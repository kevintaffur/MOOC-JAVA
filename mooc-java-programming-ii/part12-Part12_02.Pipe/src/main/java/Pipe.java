import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.list.add(value);
    }

    public T takeFromPipe() {
        if (this.list.isEmpty()) {
            return null;
        }
        T t = this.list.get(0);
        this.list.remove(0);
        return t;
    }

    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        }
        return true;
    }
}
