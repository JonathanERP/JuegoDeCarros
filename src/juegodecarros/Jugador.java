/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JOESR
 */
public class Jugador {
    
    ArrayList <String> jugadores= new ArrayList<>();
    
    public Jugador(int participantes) {
        Scanner entrada=new Scanner(System.in);
        
        for (int i=0;i<participantes;i++){
            System.out.println("\nIngrese el nombre del jugador "+(i+1));  
            String nombre=entrada.next();
            jugadores.add(nombre);
        }
    }

    ArrayList Jugadores() {
        System.out.println("\n"+jugadores);
        return jugadores;
    }
    void borrarJugador(int i){
        jugadores.remove(i);
    }
}
