package modelo;


public class Persona {
    private Integer IDPER;
    private String NOMPER,APEPER,DNIPER,TIPPER,SEXPER,TELPER,ESTPER;

     public Integer getIDPER() {
        return IDPER;
    }

    public void setIDPER(Integer IDPER) {
        this.IDPER = IDPER;
    }

    public String getNOMPER() {
        return NOMPER;
    }

    public void setNOMPER(String NOMPER) {
        this.NOMPER = NOMPER;
    }

    public String getAPEPER() {
        return APEPER;
    }

    public void setAPEPER(String APEPER) {
        this.APEPER = APEPER;
    }

    public String getDNIPER() {
        return DNIPER;
    }

    public void setDNIPER(String DNIPER) {
        this.DNIPER = DNIPER;
    }

    public String getTIPPER() {
        return TIPPER;
    }

    public void setTIPPER(String TIPPER) {
        this.TIPPER = TIPPER;
    }

    public String getSEXPER() {
        return SEXPER;
    }

    public void setSEXPER(String SEXPER) {
        this.SEXPER = SEXPER;
    }

    public String getTELPER() {
        return TELPER;
    }

    public void setTELPER(String TELPER) {
        this.TELPER = TELPER;
    }

    public String getESTPER() {
        return ESTPER;
    }

    public void setESTPER(String ESTPER) {
        this.ESTPER = ESTPER;
    }

    @Override
    public String toString() {
        return "Persona{" + "IDPER=" + IDPER + ", NOMPER=" + NOMPER + ", APEPER=" + APEPER + ", DNIPER=" + DNIPER + ", TIPPER=" + TIPPER + ", SEXPER=" + SEXPER + ", TELPER=" + TELPER + ", ESTPER=" + ESTPER + '}';
    }

    
    

  
}
