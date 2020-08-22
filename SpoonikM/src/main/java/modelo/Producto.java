package modelo;

import java.util.Objects;

public class Producto {

    private int IDPRO;
    private int CANPRO;
    private double COSPRO;
    private String ESTPRO;
    private String NOMPRO;
    private String TIPPRO;
    private double PREVENPRO;

    public int getIDPRO() {
        return IDPRO;
    }

    public void setIDPRO(int IDPRO) {
        this.IDPRO = IDPRO;
    }

    public int getCANPRO() {
        return CANPRO;
    }

    public void setCANPRO(int CANPRO) {
        this.CANPRO = CANPRO;
    }

    public double getCOSPRO() {
        return COSPRO;
    }

    public void setCOSPRO(double COSPRO) {
        this.COSPRO = COSPRO;
    }

    public String getESTPRO() {
        return ESTPRO;
    }

    public void setESTPRO(String ESTPRO) {
        this.ESTPRO = ESTPRO;
    }

    public String getNOMPRO() {
        return NOMPRO;
    }

    public void setNOMPRO(String NOMPRO) {
        this.NOMPRO = NOMPRO;
    }

    public String getTIPPRO() {
        return TIPPRO;
    }

    public void setTIPPRO(String TIPPRO) {
        this.TIPPRO = TIPPRO;
    }

    public double getPREVENPRO() {
        return PREVENPRO;
    }

    public void setPREVENPRO(double PREVENPRO) {
        this.PREVENPRO = PREVENPRO;
    }

    @Override
    public String toString() {
        return "Producto{" + "IDPRO=" + IDPRO + ", CANPRO=" + CANPRO + ", COSPRO=" + COSPRO + ", ESTPRO=" + ESTPRO + ", NOMPRO=" + NOMPRO + ", TIPPRO=" + TIPPRO + ", PREVENPRO=" + PREVENPRO + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.NOMPRO);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.NOMPRO, other.NOMPRO)) {
            return false;
        }
        return true;
    }
    
}

