package Models;

public class Pizza_Hawaii extends Pizza {

    private String type = "Hawaii";

    public Pizza_Hawaii(int size, int weight, double price, Pizzeria location) {
        super(size, weight, price, location);
    }

    public String get_type() {
        return type;
    }
    public String toString(){
        return "Size: " + this.getSize() + " Weight: "+ this.getWeight()+ " Price:" + this.getPrice()+ " Type:" + type +" From:" + this.getLocation();
    }

}
