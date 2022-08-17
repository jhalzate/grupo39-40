/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_empleados1.Modelo;

/**
 *
 * @author jhalz
 */
public class Persona {
    
    private String nombres;
    private String correo;
    private String telefono;

    public Persona(String nombres, String correo, String telefono) {
        this.nombres = nombres;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
    public Persona(){
    
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
