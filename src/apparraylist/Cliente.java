/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparraylist;

/**
 *
 * @author juaneduardomaureirallanos
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(){
        this.rut = null;
        this.nombre = null;
        this.direccion = null;
        this.telefono = null;      
    }

    public Cliente(String rut, String nombre, String direccion, String telefono){
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

}
