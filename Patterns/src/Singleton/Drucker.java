package Singleton;

public class Drucker {
    private static final Drucker Instance = new Drucker();
    //Brother ist eine Instanz von der Klasse Singleton.Drucker


    private Drucker(){
    // dass wir keine Instanz erzeugen können außerhalb dieser Klasse
    }

    public static Drucker getDrucker(){
        return Instance;
    }


    public static String Drucken(){

        String druck = "ich bin die Instanz" + Drucker.getDrucker();
        return druck;
    }

    public static String Drucken2(){

        String druck2 = "ich bin die Instanz XYZ";
        return druck2;
    }

}
