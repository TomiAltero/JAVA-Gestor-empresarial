/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Tomi Altero
 */
public class Datos_registro {
    
    private String nombre;
    private String mail;
    private String telefono;
    private String username;
    private String pass;
    private String permisos_String;

    public Datos_registro(String nombre, String mail, String telefono, String username, String pass, String permisos_String) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.username = username;
        this.pass = pass;
        this.permisos_String = permisos_String;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPermisos_String() {
        return permisos_String;
    }

    public void setPermisos_String(String permisos_String) {
        this.permisos_String = permisos_String;
    }
    
    
    
    
}
