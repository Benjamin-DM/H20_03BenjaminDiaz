package modelo;

public class Persona {

    private int IDPER;
    private String NOMPER;
    private String APEPATPER;
    private String APEMATPER;
    private String TIPPER;
    private String SEXPER;
    private int DNIPER;
    private int TELPER;
    private String ESTPER;
    private String DIRPER;

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

    public String getAPEPATPER() {
        return APEPATPER;
    }

    public void setAPEPATPER(String APEPATPER) {
        this.APEPATPER = APEPATPER;
    }

    public String getAPEMATPER() {
        return APEMATPER;
    }

    public void setAPEMATPER(String APEMATPER) {
        this.APEMATPER = APEMATPER;
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

    public int getDNIPER() {
        return DNIPER;
    }

    public void setDNIPER(int DNIPER) {
        this.DNIPER = DNIPER;
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

    public String getDIRPER() {
        return DIRPER;
    }

    public void setDIRPER(String DIRPER) {
        this.DIRPER = DIRPER;
    }

    @Override
    public String toString() {
        return "Persona{" + "IDPER=" + IDPER + ", NOMPER=" + NOMPER + ", APEPATPER=" + APEPATPER + ", APEMATPER=" + APEMATPER + ", TIPPER=" + TIPPER + ", SEXPER=" + SEXPER + ", DNIPER=" + DNIPER + ", TELPER=" + TELPER + ", ESTPER=" + ESTPER + ", DIRPER=" + DIRPER + '}';
    }

    

}
