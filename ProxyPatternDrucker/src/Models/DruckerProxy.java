package Models;

public class DruckerProxy implements Drucker {
    private Drucker druckerSw;
    private Drucker druckerColor;
    private Drucker laserDrucker;

    public DruckerProxy(){
        this.druckerSw = new SwDrucker();
        this.druckerColor = new FarbDrucker();
        this.laserDrucker = new LaserDrucker();
    }
    @Override
    public void drucken(String dokument, int seitenanzahl) {

        if(seitenanzahl < 0){
            System.out.println("Fehler, ungültige Seitenanzahl ");
            return;
        }

        if(seitenanzahl <500 && seitenanzahl >100){
            druckerSw.drucken(dokument,seitenanzahl);
            System.out.println("Bitte Papierstorage im Auge behalten und nach des Drucks die Tintenpatronen überprüfen ");
        }



        if(seitenanzahl >500 && seitenanzahl<800){
            laserDrucker.drucken(dokument,seitenanzahl);

            return;
        }

        if(seitenanzahl > 800){
            laserDrucker.drucken(dokument, seitenanzahl);
            System.out.println("Papiereinlage überprüfen");
            System.out.println("Drucker warten");
            System.out.println("Papier abkühlen lassen");
            return;
        }

        if(seitenanzahl >= 50){
            druckerSw.drucken(dokument, seitenanzahl);
        }
        else{
            druckerColor.drucken(dokument, seitenanzahl);
        }

    }
}
