package Models;

public class LaserDrucker implements Drucker{
    @Override
    public void drucken(String dokument, int seitenanzahl) {
        System.out.println("Laserdruck " + dokument );
        System.out.println("es werden " + seitenanzahl +" Seiten gedruckt");
    }
}
