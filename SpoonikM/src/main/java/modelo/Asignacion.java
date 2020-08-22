package modelo;




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

   

   
}
