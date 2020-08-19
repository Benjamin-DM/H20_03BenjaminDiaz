/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.Convert;


@FacesConverter("tipoproducto")
public class Tipoproducto implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String tipo = "";
        if (value != null) {
            tipo = (String) value;
            switch (tipo) {
                case ("P"):
                    tipo = "Postres";
                    break;
                case ("E"):
                    tipo = "Envasados";
                    break;
                case ("G"):
                    tipo = "General";
                    break;
                case ("D"):
                    tipo = "Dieta";
                    break;
            }
        }
        return tipo;
    }

}
