import Models.Briefformate_Factory;

public class Main {

    public static void main (String[] args){


        System.out.println(Briefformate_Factory.getBriefformate("A4", 5));
        System.out.println(Briefformate_Factory.getBriefformate("A5", 3));
        System.out.println(Briefformate_Factory.getBriefformate("A6", 1));
    }
}
