package Models;

public class Pizzeria_Rostock extends Pizzeria {

    private String location = "This is Pizzeria_Rostock";

    public Pizzeria_Rostock(String address, int employees) {
        super(address, employees);
    }
    public String get_location(){
        return location;
    }
    @Override
    public String toString() {
        return location;
    }
}
