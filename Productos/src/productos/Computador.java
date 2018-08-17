/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.io.Serializable;

/**
 *
 * @author ESFOT
 */
public class Computador extends Productos implements Serializable{
    
   private String tipo;
   private String procesador;
   private int ram;
   private int capacidad;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
   
   
    
    public Computador(String nombre, double precio, String marca,String categoria, String tipo, String procesador, int ram, int capacidad ) {
        super(nombre, precio, marca,categoria);
        this.tipo=tipo;
        this.procesador=procesador;
        this.ram=ram;
        this.capacidad=capacidad;
    }
    
    public Computador(String nombre, double precio, String marca, String categoria) {
        super(nombre, precio, marca, categoria);
    }
    
}
