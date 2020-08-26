package modelo;

import java.util.Objects;


public class Comida {
    private int IDCOM;
    private String NOMCOM;
    private String ESTCOM;
    private double COSCOM;
    private int CANCOM;
    private String TIPCOM;

    public int getIDCOM() {
        return IDCOM;
    }

    public void setIDCOM(int IDCOM) {
        this.IDCOM = IDCOM;
    }

    public String getNOMCOM() {
        return NOMCOM;
    }

    public void setNOMCOM(String NOMCOM) {
        this.NOMCOM = NOMCOM;
    }

    public String getESTCOM() {
        return ESTCOM;
    }

    public void setESTCOM(String ESTCOM) {
        this.ESTCOM = ESTCOM;
    }

    public int getCANCOM() {
        return CANCOM;
    }

    public void setCANCOM(int CANCOM) {
        this.CANCOM = CANCOM;
    }

    public String getTIPCOM() {
        return TIPCOM;
    }

    public void setTIPCOM(String TIPCOM) {
        this.TIPCOM = TIPCOM;
    }

    public double getCOSCOM() {
        return COSCOM;
    }

    public void setCOSCOM(double COSCOM) {
        this.COSCOM = COSCOM;
    }

    @Override
    public String toString() {
        return "Comida{" + "IDCOM=" + IDCOM + ", NOMCOM=" + NOMCOM + ", ESTCOM=" + ESTCOM + ", COSCOM=" + COSCOM + ", CANCOM=" + CANCOM + ", TIPCOM=" + TIPCOM + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.NOMCOM);
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
        final Comida other = (Comida) obj;
        if (!Objects.equals(this.NOMCOM, other.NOMCOM)) {
            return false;
        }
        return true;
    }

    

}