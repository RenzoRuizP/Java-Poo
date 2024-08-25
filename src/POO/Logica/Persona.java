package POO.Logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persona {
    String documento;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String email;
    String fechaNacimiento;

/*
    public Persona(String documento, String nombre, String apellido, String direccion, String telefono, String email, String fechaNacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }
    */

    public Persona() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public void RegistrarPersona() throws IOException {
        System.out.println("Introduzca el documento del persona: ");
        setDocumento(bf.readLine());
        System.out.println("Introduzca el nombre del persona");
        setNombre(bf.readLine());
        System.out.println("Introduzca el apellido del persona");
        setApellido(bf.readLine());
        System.out.println("Introduzca el dirección del persona");
        setDireccion(bf.readLine());
        System.out.println("Introduzca el teléfono del persona");
        setTelefono(bf.readLine());
        System.out.println("Introduzca el email del persona");
        setEmail(bf.readLine());
        System.out.println("Introduzca el fecha de nacimiento de la persona");
        setFechaNacimiento(bf.readLine());
    }
    public void EditarPersona() {}
    public void AnularPersona() {}
    public void ConsultarPersona() {
        System.out.println("Hola: soy el trabajador: "+getNombre()+" "+getApellido());
        System.out.println("Mi documento de identidad es: "+getDocumento());
        System.out.println("Mi dirección es: "+getDireccion());
    }

}
