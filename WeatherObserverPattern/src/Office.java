public class Office extends OfficeHandler{

    public Data mesData;

    public Data getActualData(){
        return this.mesData;
    }

    public void setActualData(Data data){
        this.mesData = data;
        // Nach Veränderung müssen die users notifiziert werden

        // PUSH - Variante
        sendData(data);
    }

    //danke an Pavel

}
