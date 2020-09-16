package modelo;

import java.util.Date;
import java.util.Objects;




public class Asignacion {
    private int IDASICOM;
    private int IDCOM;
    private Date FECASICOM;
    private Comida comida = new Comida();

    public int getIDASICOM() {
        return IDASICOM;
    }

    public void setIDASICOM(int IDASICOM) {
        this.IDASICOM = IDASICOM;
    }

    public int getIDCOM() {
        return IDCOM;
    }

    public void setIDCOM(int IDCOM) {
        this.IDCOM = IDCOM;
    }

    public Date getFECASICOM() {
        return FECASICOM;
    }

    public void setFECASICOM(Date FECASICOM) {
        this.FECASICOM = FECASICOM;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "IDASICOM=" + IDASICOM + ", IDCOM=" + IDCOM + ", FECASICOM=" + FECASICOM + ", comida=" + comida + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.IDCOM;
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
        if (this.IDCOM != other.IDCOM) {
            return false;
        }
        if (!Objects.equals(this.FECASICOM, other.FECASICOM)) {
            return false;
        }
        return true;
    }
 
   
}
