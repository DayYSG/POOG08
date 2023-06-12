/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo08alu07
 */
public class Gerente extends Empleado {
    private int presupuesto;

    public Gerente() {
    }

    public Gerente( String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void asignarPresupuestoI(){
        presupuesto=getSueldo()*10;
    }

    @Override
    public String toString() {
        return "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
    
    
    
}
