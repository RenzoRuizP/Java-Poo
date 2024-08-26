package POO;

import POO.Logica.Persona;
import POO.Logica.Trabajador;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        /*Persona p1 = new Persona(
                                "45977448","Renzo",
                                "Ruiz Pastor","Teniente Jimenez 110, Chorrillos",
                                "956969182","renzorp_14@hotmail.com" ,"14/08/1989" );
*/
        Persona p1 = new Persona();
        Trabajador t = new Trabajador();
        t.ConsultarPersona();
        p1.RegistrarPersona();
        p1.ConsultarPersona();

    }
}
