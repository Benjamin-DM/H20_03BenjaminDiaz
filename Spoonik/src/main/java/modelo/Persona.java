package modelo;


public class Persona {
    private int IDPER;
    private String NOMPER;
    private String APEPER;
    private Integer DNIPER;
    private String TIPPER;
    private String SEXPER;
    private Integer TELPER;
    private String ESTPER;

   

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

    public Integer getDNIPER() {
        return DNIPER;
    }

    public void setDNIPER(Integer DNIPER) {
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

    public Integer getTELPER() {
        return TELPER;
    }

    public void setTELPER(Integer TELPER) {
        this.TELPER = TELPER;
    }

    public String getESTPER() {
        return ESTPER;
    }

    public void setESTPER(String ESTPER) {
        this.ESTPER = ESTPER;
    }

       public int getIDPER() {
        return IDPER;
    }

    public void setIDPER(int IDPER) {
        this.IDPER = IDPER;
    }

    @Override
    public String toString() {
        return "Persona{" + "IDPER=" + IDPER + ", NOMPER=" + NOMPER + ", APEPER=" + APEPER + ", DNIPER=" + DNIPER + ", TIPPER=" + TIPPER + ", SEXPER=" + SEXPER + ", TELPER=" + TELPER + ", ESTPER=" + ESTPER + '}';
    }
    
          
     
    
    

  
}
