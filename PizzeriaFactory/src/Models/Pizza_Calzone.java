package Models;

public class Pizza_Calzone extends Pizza {

    private String type = "Calzone";

    public Pizza_Calzone(int size, int weight, double price, Pizzeria location) {
        super(size, weight, price, location);
    }

    public String get_type() {
        return type;
    }
    public String toString(){
        return "Size: " + this.getSize() + " Weight: "+ this.getWeight()+ " Price:" + this.getPrice()+ " Type:" + type +" From:" + this.getLocation();
    }
    }



