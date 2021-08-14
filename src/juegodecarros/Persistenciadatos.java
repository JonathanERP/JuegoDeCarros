/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecarros;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author JOESR
 */
public class Persistenciadatos {
    
    public Persistenciadatos(){
        File archivo = new File("D:\\persistenciadedatos.txt");
        try {
            PrintWriter pc = new PrintWriter(archivo);
            pc.close();
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    void datos(ArrayList nombres,ArrayList listavecesganadas){
        File archivo = new File("D:\\persistenciadedatos.txt");
        try {
            PrintWriter pc = new PrintWriter(archivo);
            pc.println("\nFelicidades Primer lugar para "+nombres.get(0)+" con "+listavecesganadas.get(0)+" Pistas ganadas");
            pc.println("\nFelicidades Segundo lugar para "+nombres.get(1)+" con "+listavecesganadas.get(1)+" Pistas ganadas");
            pc.println("\nFelicidades Tercer lugar para "+nombres.get(2)+" con "+listavecesganadas.get(2)+" Pistas ganadas");
            pc.close();
            System.out.println("se creo el archivo en el disco local D");
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
