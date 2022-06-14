public class Hideout<T> {
    private T t;

    public Hideout() {
        this.t = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }
    
    public T takeFromHideout() {
        T str = this.t;
        this.t = null;
        return str;
    }
    
    public boolean isInHideout() {
        if (this.t == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((t == null) ? 0 : t.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hideout other = (Hideout) obj;
        if (t == null) {
            if (other.t != null)
                return false;
        } else if (!t.equals(other.t))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.t.toString();
    }
}
