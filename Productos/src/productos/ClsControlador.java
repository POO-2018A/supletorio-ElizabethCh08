/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsControlador {
    
    private void crearFichero(String nombreFichero){
        ObjectOutputStream oos;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));//Crea un archivo 
            oos.close(); //stream: flujo de informacion canal de comnunicacion con el archivo 
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
    
    public void escribirObjeto(String nombreFichero, ArrayList<Object> elementos){ //El arrglo recibe cualquier obejto
        System.out.println("llega");
        try{
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero)); //Busca un fichero con ese nombre
            for(int i = 0; i < elementos.size() ; i++){
                Object elemento = new Object();
                elemento = elementos.get(i); 
                oos.writeObject(elemento);
                System.out.println(elemento.toString());
            }
            oos.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex);
        }
    
    }
    
    public ArrayList<Object> extraerObjetos(String nombreFichero){
        ArrayList<Object> elementos = new ArrayList<>();
        
        //Controlar los errores, en el catch se controla lo que salio mal se intenta arreglar el error
        
        try{
            ObjectInputStream ois; //Lee los datos de entrada
            //FileInputStream recoge los datos y los envia
            ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            //Se guardan objetos no strings
            Object aux = ois.readObject();
            while(aux!= null){
                elementos.add(aux);
                aux = ois.readObject();
            }
            ois.close();
        
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no existe, lo voy a crear.");
            crearFichero(nombreFichero);
        }catch (EOFException e1)
        {
            //System.out.println ("Fin de fichero");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        return elementos;
    }
    
}
