package modelo;

import java.util.Objects;




public class Asignacion {
    private int IDASICOM;
    private int IDPER;
    private int IDCOM;
    private String FECASICOM;
    private Comida comida = new Comida();
    
    public int getIDASICOM() {
        return IDASICOM;
    }

    public void setIDASICOM(int IDASICOM) {
        this.IDASICOM = IDASICOM;
    }

    public int getIDPER() {
        return IDPER;
    }

    public void setIDPER(int IDPER) {
        this.IDPER = IDPER;
    }

    public int getIDCOM() {
        return IDCOM;
    }

    public void setIDCOM(int IDCOM) {
        this.IDCOM = IDCOM;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public String getFECASICOM() {
        return FECASICOM;
    }

    public void setFECASICOM(String FECASICOM) {
        this.FECASICOM = FECASICOM;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "IDASICOM=" + IDASICOM + ", IDPER=" + IDPER + ", IDCOM=" + IDCOM + ", FECASICOM=" + FECASICOM + ", comida=" + comida + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.FECASICOM);
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
        final Asignacion other = (Asignacion) obj;
        if (!Objects.equals(this.FECASICOM, other.FECASICOM)) {
            return false;
        }
        return true;
    }

   

   
}
