import Models.*;


public class Main {
    public static void main(String[] args) {



        System.out.println(PizzaFactory.getPizza(Ort.Berlin,Pizza_typ.Calzone));
        System.out.println(PizzaFactory.getPizza(Ort.Hamburg, Pizza_typ.Hawaii));
        System.out.println(PizzaFactory.getPizza(Ort.Rostock,Pizza_typ.Hawaii));
        System.out.println(PizzaFactory.getPizza(Ort.Hamburg,Pizza_typ.Salami).getLocation().get_address());
    }
}