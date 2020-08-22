/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class AsignacionP {

    private int IDASIPER;
    private int IDPER;
    private int IDASICOM;
    private Persona persona = new Persona();

    public int getIDASIPER() {
        return IDASIPER;
    }

    public void setIDASIPER(int IDASIPER) {
        this.IDASIPER = IDASIPER;
    }

    public int getIDPER() {
        return IDPER;
    }

    public void setIDPER(int IDPER) {
        this.IDPER = IDPER;
    }

    public int getIDASICOM() {
        return IDASICOM;
    }

    public void setIDASICOM(int IDASICOM) {
        this.IDASICOM = IDASICOM;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "AsignacionP{" + "IDASIPER=" + IDASIPER + ", IDPER=" + IDPER + ", IDASICOM=" + IDASICOM + ", persona=" + persona + '}';
    }
    
}
