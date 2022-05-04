public class Aereo {
    private String codice = "";
    private String modello = "";
    private int km = 0;
    private int postiTotali = 0;
    private int postiRestanti = 0;


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

    public int getPostiTotali() {
        return postiTotali;
    }

    public void setPostiTotali(int postiTotali) {
        this.postiTotali = postiTotali;
    }

    public int getPostiRestanti() {
        return postiRestanti;
    }

    public void setPostiRestanti(int postiRestanti) {
        this.postiRestanti = postiRestanti;
    }
}
