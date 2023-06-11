/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu07
 */
public class HiloR implements Runnable {
    
    public HiloR(){   
    }
    
    @Override
    public void run () {
        for (int i=0; i<10; i++){
           System.out.println("Iteraciòn "+ i + Thread.currentThread().getName());
       }
        System.out.println("\nTermina el "+ Thread.currentThread().getName());
    }
    
}
