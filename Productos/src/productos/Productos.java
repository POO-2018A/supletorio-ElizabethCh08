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
public class Productos implements Serializable{
    
    private String nombre;
    private double precio;
    private String marca;
    private String categoria;
    

    public Productos(String nombre, double precio, String marca,String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.categoria=categoria;
    }
    public Productos(){}
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
    
    
}
