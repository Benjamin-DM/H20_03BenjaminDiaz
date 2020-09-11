package modelo;


public class Persona {
    private int IDPER;
    private String NOMPER;
    private String APEPER;
    private String APEMATPER;
    private int DNIPER;
    private String TIPPER;
    private String SEXPER;
    private int TELPER;
    private String ESTPER;

    public int getIDPER() {
        return IDPER;
    }

    public void setIDPER(int IDPER) {
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

    public String getAPEMATPER() {
        return APEMATPER;
    }

    public void setAPEMATPER(String APEMATPER) {
        this.APEMATPER = APEMATPER;
    }

    public int getDNIPER() {
        return DNIPER;
    }

    public void setDNIPER(int DNIPER) {
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

    public int getTELPER() {
        return TELPER;
    }

    public void setTELPER(int TELPER) {
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
        return "Persona{" + "IDPER=" + IDPER + ", NOMPER=" + NOMPER + ", APEPER=" + APEPER + ", APEMATPER=" + APEMATPER + ", DNIPER=" + DNIPER + ", TIPPER=" + TIPPER + ", SEXPER=" + SEXPER + ", TELPER=" + TELPER + ", ESTPER=" + ESTPER + '}';
    }

  
}
