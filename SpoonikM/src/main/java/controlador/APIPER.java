
//package controlador;
//
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import dao.PersonaImpl;
//import java.io.IOException;
//import javax.enterprise.context.RequestScoped;
//import javax.inject.Named;
//import modelo.Persona;
//import service.Servicios;
//
//@Named(value = "APIPER")
//@RequestScoped
//public class APIPER {
//
//    private Persona persona = new Persona();
//    private final PersonaImpl dao = new PersonaImpl();
//    private final Servicios services = new Servicios();
//
//public void llenardatos() throws IOException, InterruptedException {
//        JsonParser jsonParser = new JsonParser();
//        JsonObject jsonObject = (JsonObject) jsonParser.parse(services.datosAPI(persona.getDNIPER()));
//
//        persona.setNOMPER(jsonObject.get("nombres").getAsString());
//        persona.setAPEPER((jsonObject.get("apellido_paterno").getAsString())
//                +(jsonObject.get("apellido_materno").getAsString()));
//        persona.setDNIPER(jsonObject.get("dni").getAsInt());
//    }
//
//    public void respuesta() throws IOException, InterruptedException, Exception {
//        JsonParser jsonParser = new JsonParser();
//        JsonObject jsonObject = (JsonObject) jsonParser.parse(services.datosAPI(persona.getDNIPER()));
//
//        persona.setNOMPER(jsonObject.get("nombres").getAsString());
//        persona.setAPEPER((jsonObject.get("apellido_paterno").getAsString())+(jsonObject.get("apellido_materno").getAsString()));
//        persona.setDNIPER(jsonObject.get("dni").getAsInt());
//
//        System.out.println(persona.getNOMPER() + persona.getAPEPER() + persona.getDNIPER());
//
//        dao.registrar(persona);
//    }
//
//    public Persona getPersona() {
//        return persona;
//    }
//
//    public void setPersona(Persona persona) {
//        this.persona = persona;
//    }
//
//
//
//}
