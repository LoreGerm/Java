public class Prenotazione {
    private Volo volo;
    private Aereo aereo;
    private String postoPrenotato = "";

    public Volo getVolo() {
        return volo;
    }

    public void setVolo(Volo volo) {
        this.volo = volo;
    }

    public Aereo getAereo() {
        return aereo;
    }

    public void setAereo(Aereo aereo) {
        this.aereo = aereo;
    }

    public String getPostoPrenotato() {
        return postoPrenotato;
    }

    public void setPostoPrenotato(String postoPrenotato) {
        this.postoPrenotato = postoPrenotato;
    }
}
