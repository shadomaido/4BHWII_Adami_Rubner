package Models;

public class SwDrucker implements Drucker{
    @Override
    public void drucken(String dokument, int seitenanzahl) {
        System.out.println("Schwarz-Weiß-Druck " +dokument);
        System.out.println("es werden "+ seitenanzahl +" Seiten gedruckt");

    }

}
