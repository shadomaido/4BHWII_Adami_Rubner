import Singleton.Drucker;


public class Main {
    public static void main(String[] args) {


    Drucker d1 = Drucker.getDrucker();
    //dadurch dass sie private ist kann man sich die Instanz nur so holen
    Drucker d2 = Drucker.getDrucker();


    d1.Drucken();
    d2.Drucken();

    System.out.println(d1.Drucken());

    System.out.println(d2.Drucken());
    System.out.println(d1.Drucken2());


    }
}