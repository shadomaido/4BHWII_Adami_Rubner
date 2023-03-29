package Models;

public abstract class Briefformate {

    public abstract int getWeight();
    public abstract String getSize();


    public String toString() {
        return "size: " + getSize() + " Weight: " + getWeight();
    }
}
