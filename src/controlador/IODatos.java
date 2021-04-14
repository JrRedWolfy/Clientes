/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author alumnodaw
 */
public class IODatos {
    
    // METODOS NECESARIOS
    // inicializarClientes: Necesitamos inicializar vCliente con los objetos Cliente almacenados en un Archivo Binario.
    
    // guardarClientes: (En evento Cerrar) Borrar el archivo .dat antiguo, y generar el nuevo.
    
    
    // Leer
    
    public static ArrayList<Cliente> cargarDatos(){
        ArrayList<Cliente> vCliente = new ArrayList<>();
      
        
        try {
            ObjectInputStream entrada;
            entrada = new ObjectInputStream(new FileInputStream(“datos.dat”));
            vCliente entrada.readObject();
            
        } catch (IOException e) {
            
        }
        
        
        return vCliente;
        
        
        
        
        
        
        
    }
    
    // Guardar
    
    public static void guardarClientes(ArrayList<Cliente> vCliente){
        
       
        
        try {
            ObjectOutputStream salida;
            salida=new ObjectOutputStream(new FileOutputStream(“datos.dat”));
            salida.writeObject(vCliente);
        } catch (IOException e) {
           
        }
        
       
    }
 
}
