public class Biglietto {
    private String stazionePartenza;
    private String stazioneArrivo;
    private double prezzo;

    public Biglietto (String stazionePartenza, String stazioneArrivo, double prezzo){
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.prezzo = prezzo;
    }
    public Biglietto (Biglietto that){
        this.stazionePartenza = that.stazionePartenza;
        this.stazioneArrivo = that.stazioneArrivo;
        this.prezzo = that.prezzo;
    }
    public Biglietto (){
        this.stazionePartenza = "";
        this.stazioneArrivo = "";
        this.prezzo = 2.50;
    }

    public String getStazionePartenza(){
        return stazionePartenza;
    }
    public String getStazioneArrivo(){
        return stazioneArrivo;
    }
    public double getPrezzo(){
        return prezzo;
    }

    public void setStazionePartenza(String stazionePartenza){
        this.stazionePartenza = stazionePartenza;
    }
    public void setStazioneArrivo(String stazioneArrivo){
        this.stazioneArrivo = stazioneArrivo;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }


}
