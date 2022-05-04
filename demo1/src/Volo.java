public class Volo {
    private Aeroporto partenza;
    private Aeroporto arrivo;
    Aereo aereo;
    private String oraPartenza = "";
    private String oraArrivo = "";
    private String dataArrivo = "";
    private String dataPartenza = "";

    public Aeroporto getPartenza() {
        return partenza;
    }

    public void setPartenza(Aeroporto partenza) {
        this.partenza = partenza;
    }

    public Aeroporto getArrivo() {
        return arrivo;
    }

    public void setArrivo(Aeroporto arrivo) {
        this.arrivo = arrivo;
    }

    public String getOraPartenza() {
        return oraPartenza;
    }

    public void setOraPartenza(String oraPartenza) {
        this.oraPartenza = oraPartenza;
    }

    public String getOraArrivo() {
        return oraArrivo;
    }

    public void setOraArrivo(String oraArrivo) {
        this.oraArrivo = oraArrivo;
    }

    public String getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(String dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public String getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(String dataPartenza) {
        this.dataPartenza = dataPartenza;
    }
}
