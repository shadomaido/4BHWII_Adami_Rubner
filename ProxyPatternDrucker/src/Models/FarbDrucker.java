package Models;

public class FarbDrucker implements Drucker{
    @Override
    public void drucken(String dokument, int seitenanzahl) {
        System.out.println("Farbiger Druck "+ dokument);
        System.out.println("es werden "+ seitenanzahl +" Seiten gedruckt");
    }
}
