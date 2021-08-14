/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecarros;

import java.util.ArrayList;

/**
 *
 * @author JOESR
 */
public class Carril {
    
    ArrayList <String> carriles= new ArrayList<>();
    
    public Carril(int numerodeConductores) {
                
        for (int i=0;i<numerodeConductores;i++){
          carriles.add("carril "+(i+1));  
        }
    }

    void mostrarCarriles() {
        System.out.println("\n"+carriles);
    }
    
}
