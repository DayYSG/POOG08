/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu07
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia Hilo principal");
        
        //hilos que se heredan 
        /*Hilo hilo1 = new Hilo("Primer hilo");
        hilo1.start();//Va a crear un hilo y despues se va a iniciar y va a ejecutar la iteracio de imprecion de 10 veces
        Hilo hilo2= new Hilo("Segundo hilo");
        hilo2.start();//para empezar una competencia entre hilo 1 y 2 
        //vemos el indeterminismo 
        Hilo hilo3= new Hilo("Tercer hilo");
        hilo3.start();*/
        
        //Para Simplificar lo de arriba
        /*new Hilo("Primer Hilo").start();
        new Hilo("Segundo Hilo").start();
        new Hilo("Tercer Hilo").start();
        */
        
        //hilo que se implementa de runnable
        new Thread(new HiloR()," Primer HiloR").start();
        new Thread(new HiloR()," Segundo HiloR").start();
        new Thread(new HiloR()," Tercer HiloR").start();
        
    }
    
}
