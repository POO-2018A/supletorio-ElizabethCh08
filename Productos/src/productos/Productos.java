/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author ESFOT
 */
public class Productos {
    
    private String nombre;
    private String precio;
    private String marca;

    public Productos(String nombre, String precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }
    public Productos(){}
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
   
    
    
}
