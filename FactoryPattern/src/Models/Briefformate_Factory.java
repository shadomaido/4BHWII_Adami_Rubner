package Models;

public class Briefformate_Factory {

    public static Briefformate getBriefformate(String size, int weight){
        if(size.equals("A4")){
            return new A4(weight,size);
        }
        if(size.equals("A5")){
            return new A5(weight,size);
        }
        if(size.equals("A6")){
            return new A6(weight, size);
        }
        else{
            return null;
        }

        // Anzahl an Briefformate = Anzahl der If's im Factory Pattern
        // jedes A4, A5 ,... erbt von Briefformate --> jedes Format ist auch ein Briefformat

    }


}
