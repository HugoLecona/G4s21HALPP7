/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21halpp7;

import Informacion.Datos;
import java.awt.AWTEventMulticaster;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lecona
 */
public class G4s21HALPP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Datos> listadatos = new ArrayList<Datos>();
        Datos objdatos = new Datos("Francisco", 20, "fran@gmail.com");
        listadatos.add(objdatos);
        
        objdatos= new Datos(); //Lanzando un nuevo registro de datos
        
        objdatos.setNombre("Miguel Sanchez");
        objdatos.setEdad(24);
        objdatos.setCorreo("Migue@gmail.com");
        listadatos.add(objdatos);
        
        objdatos= new Datos("Ricardo", 34, "rica@gmai.com");//Nuevo registro de datos
        listadatos.add(objdatos);
        
        
        for(Datos datos : listadatos){
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("datos " + datos.getCorreo());
            System.out.println("");
        }
        
        System.out.println("------------------------------");
        System.out.println("usando forEach ");
        System.out.println("------------------------------");
        System.out.println("");
        
        listadatos.forEach(datos -> {
            System.out.println("nombre "+ datos.getNombre());
            System.out.println("Edad "+ datos.getEdad());
            System.out.println("Correo "+ datos.getCorreo());
            System.out.println("");
        
        });
        
        System.out.println("------------------------------");
        System.out.println("usando stream for each ");
        System.out.println("------------------------------");
        System.out.println("");
        
        listadatos.stream().forEach(datos -> {
            System.out.println("nombre "+ datos.getNombre());
            System.out.println("Edad "+ datos.getEdad());
            System.out.println("Correo "+ datos.getCorreo());
            System.out.println("");
        
        });
        
        
        
     
    }
    
}
