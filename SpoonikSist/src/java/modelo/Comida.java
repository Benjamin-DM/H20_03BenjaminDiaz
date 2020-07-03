package modelo;


public class Comida {
    private Integer IDCOM;
    private String NOMCOM, ESTCOM;
    private String CSTCOM;

    public Integer getIDCOM() {
        return IDCOM;
    }

    public void setIDCOM(Integer IDCOM) {
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

    public String getCSTCOM() {
        return CSTCOM;
    }

    public void setCSTCOM(String CSTCOM) {
        this.CSTCOM = CSTCOM;
    }

    @Override
    public String toString() {
        return "Comida{" + "IDCOM=" + IDCOM + ", NOMCOM=" + NOMCOM + ", ESTCOM=" + ESTCOM + ", CSTCOM=" + CSTCOM + '}';
    }
   
}
