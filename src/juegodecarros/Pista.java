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
public class Pista {
    ArrayList <String> pistas= new ArrayList<>();
    int resp,resp1;
    
    
    public Pista(){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("\nDigite el numero de pistas que van a jugar");
        resp=entrada.nextInt();
        
        System.out.println("\nDigite el numero de KM que tendran las pistas");
        resp1=entrada.nextInt();
        
        for (int i=0;i<resp;i++){
            pistas.add("pista "+(i+1)); 
        }
       
    }
    void mostrarPistas() {
        System.out.println("\n"+pistas);
    } 
    void mostrarKM() {
        System.out.println("\n"+resp1+" KM");
    } 
    int numerodepistas(){
        return resp;
    }
    int limitedeKM(){
        return resp1;
    }
}
