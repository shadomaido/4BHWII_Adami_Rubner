package Models;

public class Pizzeria_Hamburg extends Pizzeria {

    private String location = "This is Pizzeria_Hamburg";

    public Pizzeria_Hamburg(String address, int employees) {
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
