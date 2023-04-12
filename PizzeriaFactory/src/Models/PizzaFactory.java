package Models;

public class PizzaFactory {

    private static Pizzeria HAMBURG =  new Pizzeria_Hamburg("Hamburg 1 1", 10);
    private static Pizzeria BERLIN =  new Pizzeria_Berlin("Berlin 1 1", 12);
    private static Pizzeria ROSTOCK =  new Pizzeria_Rostock("Rostock 1 1", 5);


    // müsste die einzelnen pizzerien zu singeltons machen
    public static Pizza getPizza(Enum o, Enum p){
        if (o == Ort.Berlin ){

            if(p == Pizza_typ.Calzone){ return new Pizza_Calzone(10, 20, 1.1, BERLIN );}
            if(p == Pizza_typ.Salami){return new Pizza_Salami(10, 20, 1.1, BERLIN );}
            if(p == Pizza_typ.Hawaii){return new Pizza_Hawaii(10, 20, 1.1, BERLIN );}

        }
        if (o == Ort.Rostock ){

            if(p == Pizza_typ.Calzone){ return new Pizza_Calzone(10, 20, 1.1, ROSTOCK );}
            if(p == Pizza_typ.Salami){return new Pizza_Salami(10, 20, 1.1, ROSTOCK );}
            if(p == Pizza_typ.Hawaii){return new Pizza_Hawaii(10, 20, 1.1, ROSTOCK );}

        }
        if (o == Ort.Hamburg ){

            if(p == Pizza_typ.Calzone){ return new Pizza_Calzone(10, 20, 1.1, HAMBURG );}
            if(p == Pizza_typ.Salami){return new Pizza_Salami(10, 20, 1.1, HAMBURG );}
            if(p == Pizza_typ.Hawaii){return new Pizza_Hawaii(10, 20, 1.1, HAMBURG );}

        }
        return null;


    }
}
