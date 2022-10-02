/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporte;

/**
 *
 * @author Matias
 */
public class Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobus Autobus1 = new Autobus();
        Autobus1.anio = 2010;
        Autobus1.marca = "mercedes";
        Autobus1.pasajero = 50;
        
        System.out.println("anio: " + Autobus1.anio + " marca: " + Autobus1.marca + " pasajeros: " + Autobus1.pasajero);
        
        Automovil Automovil1 = new Automovil();
        Automovil1.anio = 2019;
        Automovil1.marca = "Nissan";
        Automovil1.color = "rojo";
        
        System.out.println("anio: " + Automovil1.anio + " marca: " + Automovil1.marca + " color: " + Automovil1.color);
        
        Camion Camion1 = new Camion();
        Camion1.anio = 2016;
        Camion1.marca = "toyota";
        Camion1.carga = 50;
        
        System.out.println("anio: " + Camion1.anio + " marca: " + Camion1.marca + " carga: " + Camion1.carga);
    }
    
}
