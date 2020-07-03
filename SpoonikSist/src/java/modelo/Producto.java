package modelo;

public class Producto {
    private Integer IDPRO, CANPRO;
    private String CSTPRO;
    private String ESTPRO, NOMPRO;

    public Integer getIDPRO() {
        return IDPRO;
    }

    public void setIDPRO(Integer IDPRO) {
        this.IDPRO = IDPRO;
    }

    public Integer getCANPRO() {
        return CANPRO;
    }

    public void setCANPRO(Integer CANPRO) {
        this.CANPRO = CANPRO;
    }

    public String getCSTPRO() {
        return CSTPRO;
    }

    public void setCSTPRO(String CSTPRO) {
        this.CSTPRO = CSTPRO;
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

    @Override
    public String toString() {
        return "Producto{" + "IDPRO=" + IDPRO + ", CANPRO=" + CANPRO + ", CSTPRO=" + CSTPRO + ", ESTPRO=" + ESTPRO + ", NOMPRO=" + NOMPRO + '}';
    }

    

    

    
}
