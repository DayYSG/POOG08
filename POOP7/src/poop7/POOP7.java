/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import animales.Animal;
import animales.AnimalAcuatico;

/**
 *
 * @author poo08alu07
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado=new Empleado("Roberto",1122333,25000);
        System.out.println(empleado);
        
        Gerente gerente = new Gerente("Ramon",112231,50_000,0);
        System.out.println(gerente);
        System.out.println(gerente.getNombre());
        
        System.out.println("############# IS-A (Es un) ###############");
        if(gerente instanceof Gerente){
            System.out.println("Instancia de Gerente");
        } if (gerente instanceof Empleado){
            System.out.println("N2 Instancia de Empleado");
        } if (gerente instanceof Object){
            System.out.println("N3 Instancia de Object");}
        
        System.out.println(" ");
        System.out.println("#####################Animales####################");
        Animal animal = new Animal ("Copo","mexico","Beige");
        System.out.println(animal);
        AnimalAcuatico animalacuatico = new AnimalAcuatico("nemo","oceano","naranja",2);
        System.out.println(animalacuatico);
               
        
    }
}

    
