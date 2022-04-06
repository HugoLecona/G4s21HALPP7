/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author lecona
 */
public class Datos {
    
    //Las variables si se necesitan declarar para poder trabajar con asistente (A MANO)
    private String nombre;
    private int edad;
    private String correo;
    
    //public void Datos(){} //CONSTRUCTOR
    
    //public void datos(String nombre, int edad, String coreeo){
        //this.nombre = nombre; //THIS sirve para datos ambiguos, así se le especifica al sistema la variable y se rompe la ambiguedad
        //this.edad = edad;     // SIEMPRE en variables locales se usa this
        //this.correo = correo; //Sin this son variables globales
    //}
    
    //public void setNombre(String nombre){
        //this.nombre = nombre;
    //}
    
    //public String getNombre(){
        //return nombre;
    //}
    
    //Con Asistente

    public Datos() {
    }

    public Datos(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
