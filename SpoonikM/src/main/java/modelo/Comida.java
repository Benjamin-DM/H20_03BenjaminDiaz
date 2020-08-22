package modelo;


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

    

}