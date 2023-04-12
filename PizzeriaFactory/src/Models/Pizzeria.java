package Models;

public  abstract class Pizzeria {

    private String address;
    private int employees;

    
    public Pizzeria(String address, int employees ){
        this.address = address;
        this.employees = employees;

    }

    public String get_address(){

        return  this.address;
    }

    public int getEmployees(){
        return  this.employees;
    }

}

//double money = 100.1;
//NumberFormat formatter = NumberFormat.getCurrencyInstance();
//String moneyString = formatter.format(money);
//System.out.println(moneyString);