package Models;

public class Pizzeria_Berlin extends Pizzeria {


    private String location = "This is Pizzeria_Berlin";

    public Pizzeria_Berlin(String address, int employees) {
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
