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
public class Podio {
    
    ArrayList <String> podio= new ArrayList<>();
    
    public Podio(){
    
    }
      
    void agregarpodio(String mayorI) {
        podio.add(mayorI);
    }
    
    public ArrayList contarrepetidospodio(int numeroConductores,ArrayList nombres,ArrayList podio){
        int repetidos=0;
        ArrayList <Integer> listarepetidos= new ArrayList<>();
        
        for(int i =0;i<numeroConductores;i++){
            for(int j =0;j<podio.size();j++){
                if(podio.get(j)==nombres.get(i)){
                repetidos++;    
                }
            }
            listarepetidos.add(repetidos);
            repetidos=0;
        }
        return listarepetidos;
    }
    public ArrayList listapodio() {
              
        return podio;
    }
    void lugares(ArrayList nombres,ArrayList listavecesganadas){
        System.out.println("\nPrimer lugar "+nombres.get(0)+" con "+listavecesganadas.get(0)+" Pistas ganadas");
        System.out.println("\nSegundo lugar "+nombres.get(1)+" con "+listavecesganadas.get(1)+" Pistas ganadas");
        System.out.println("\nTercer lugar "+nombres.get(2)+" con "+listavecesganadas.get(2)+" Pistas ganadas");
    }
    
}
