package modelo;

import java.util.Objects;


public class Persona {
    private int IDPER;
    private String NOMPER;
    private String APEPER;
    private String APEMATPER;
    private String DNIPER;
    private String TIPPER;
    private String SEXPER;
    private String TELPER;
    private String ESTPER;

    public Persona() {
    }

    
    public Persona(int IDPER, String NOMPER, String APEPER, String APEMATPER, String DNIPER, String TIPPER, String SEXPER, String TELPER, String ESTPER) {
        this.IDPER = IDPER;
        this.NOMPER = NOMPER;
        this.APEPER = APEPER;
        this.APEMATPER = APEMATPER;
        this.DNIPER = DNIPER;
        this.TIPPER = TIPPER;
        this.SEXPER = SEXPER;
        this.TELPER = TELPER;
        this.ESTPER = ESTPER;
    }

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
        return "Persona{" + "IDPER=" + IDPER + ", NOMPER=" + NOMPER + ", APEPER=" + APEPER + ", APEMATPER=" + APEMATPER + ", DNIPER=" + DNIPER + ", TIPPER=" + TIPPER + ", SEXPER=" + SEXPER + ", TELPER=" + TELPER + ", ESTPER=" + ESTPER + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.NOMPER);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.NOMPER, other.NOMPER)) {
            return false;
        }
        return true;
    }

  

  
}
