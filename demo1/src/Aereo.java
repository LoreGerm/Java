public class Aereo {
    private String codice = "";
    private String modello = "";
    private int km = 0;
    private Posto[] postiTotali = null;


    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }


    public Posto[] getPostiTotali() {
        return postiTotali;
    }

    public void setPostiTotali(Posto[] postiTotali) {
        this.postiTotali = postiTotali;
    }
}
