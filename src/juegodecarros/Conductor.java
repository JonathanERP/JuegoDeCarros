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
public class Conductor {
    ArrayList <String> conductores= new ArrayList<>();
    
    public Conductor(int participantes, ArrayList nombres) {
        
        Scanner entrada=new Scanner(System.in);
                
        for (int i=0;i<participantes;i++){
            System.out.println("\n"+nombres.get(i)+ " quieres ser un conductor? ingrese si o no");
            String resp=entrada.next();
            if("si".equals(resp)){
                conductores.add("conductor "+(i+1));
            }    
            else{
                nombres.remove(i);
                System.out.println(nombres);
                participantes--;
                i--;
            }
        }
    }
    
    void mostrarConductores() {
        System.out.println("\n"+conductores);
    }
    int numerodeConductores(){
        return conductores.size();
    }
}
