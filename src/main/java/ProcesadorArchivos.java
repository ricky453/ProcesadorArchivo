
import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class ProcesadorArchivos implements Serializable {
    
    public Boolean ValidarArchivos(String path){
        FileReader lector;
        boolean salida = false;
        try {
            lector= new FileReader(path);
            try {
                int codigo = lector.read();
                while(codigo != -1){
                    char letra = (char) codigo;
                    codigo = lector.read();
                    
                }LeerArchivo(path);
                                

            } catch (Exception e) {
            }
            finally{
                lector.close();
           }             
            
        } catch (Exception e) {
            System.out.println("No lo encontro xd");
        }
            
        
        return salida;
    }
    
    
    public ArrayList<Object> LeerArchivo(String path){
        ArrayList<Object> lista = new ArrayList<>();
        try {
            FileReader lectura = new FileReader(path);
            try {
                int codigo = lectura.read();
                String cadena="";
                while (codigo != -1){
                    char letra=(char) codigo;
                    cadena+=letra;
                    codigo=lectura.read();
                }
                String objetos[] = cadena.split(",");
                for(String e:objetos){
                    lista.add(e);
                    System.out.println(e);
                }
                
            } catch (Exception ex) {
                Logger.getLogger(ProcesadorArchivos.class.getClass()).log(Level.SEVERE, null, ex);
            }finally{
                lectura.close();
                }
            } catch (Exception ex) {
                Logger.getLogger(ProcesadorArchivos.class.getClass()).log(Level.SEVERE, null, ex);
            }
        return lista;         
        }
    
    }
