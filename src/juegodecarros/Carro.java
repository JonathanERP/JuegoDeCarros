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
public class Carro {
    
    ArrayList <String> carros= new ArrayList<>();
    
    public Carro(int numerodeConductores) {
        
        for (int i=0;i<numerodeConductores;i++){
          carros.add("carro "+(i+1));  
        }
    }

    
    ArrayList listaCarros() {
        System.out.println("\n"+carros);
        return carros;
    }
}
