package Models;

public  abstract class Pizza {
    private int size;
    private int weight;
    private double price;
    private Pizzeria location;



    public Pizza(int size, int weight, double price, Pizzeria location){
        this.size=size;
        this.weight =weight;
        this.price = price;
        this.location = location ;
    }

    public Pizzeria getLocation(){

        return  this.location;
    }

    public int getSize(){
        return  this.size;
    }
    public int getWeight(){
        return  this.weight;
    }
    public double getPrice(){
        return  this.price;
    }
}

//double money = 100.1;
//NumberFormat formatter = NumberFormat.getCurrencyInstance();
//String moneyString = formatter.format(money);
//System.out.println(moneyString);