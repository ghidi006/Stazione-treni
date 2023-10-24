public class Treno {
    private int numeroTreno;
    private String stazionePartenza;
    private String stazioneArrivo;
    private int postiLiberi;
    private int postiOccupati;
    private int postiTotali;

    public Treno (int numeroTreno, String stazionePartenza, String stazioneArrivo, int postiLiberi, int postiOccupati, int postiTotali){
        this.numeroTreno= numeroTreno;
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.postiLiberi = postiLiberi;
        this.postiOccupati = postiOccupati;
        this.postiTotali = postiTotali;
    }
    public Treno (Treno that){
        this.numeroTreno= that.numeroTreno;
        this.stazionePartenza = that.stazionePartenza;
        this.stazioneArrivo = that.stazioneArrivo;
        this.postiLiberi = that.postiLiberi;
        this.postiOccupati = that.postiOccupati;
        this.postiTotali = that.postiTotali;
    }
    public Treno (){
        this.numeroTreno= 10;
        this.stazionePartenza = "";
        this.stazioneArrivo = "";
        this.postiLiberi = postiTotali - postiOccupati;
        this.postiOccupati = 80;
        this.postiTotali = 100;
    }

    public int getNumeroTreno(){
        return numeroTreno;
    }
    public String getStazionePartenza(){
        return stazionePartenza;
    }
    public String getStazioneArrivo(){
        return stazioneArrivo;
    }
    public int getPostiLiberi(){
        return postiLiberi;
    }
    public int getPostiOccupati(){
        return postiOccupati;
    }
    public int getPostiTotali(){
        return postiTotali;
    }

    public void setNumeroTreno(int numeroTreno){
        this.numeroTreno= numeroTreno;
    }
    public void setStazionePartenza(String stazionePartenza){
        this.stazionePartenza = stazionePartenza;
    }
    public void setStazioneArrivo(String stazioneArrivo){
        this.stazioneArrivo = stazioneArrivo;
    }
    public void setPostiLiberi(int postiLiberi){
        this.postiLiberi = postiLiberi;
    }
    public void setPostiOccupati(int postiOccupati){
        this.postiOccupati = postiOccupati;
    }
    public void setPostiTotali(int postiTotali){
        this.postiTotali = postiTotali;
    }

}
