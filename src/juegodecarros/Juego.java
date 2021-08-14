package juegodecarros;

import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
    static ArrayList <String> nombres= new ArrayList<>();
    static ArrayList <String> listacarros= new ArrayList<>();
    static ArrayList <Integer> resultados= new ArrayList<>();
    static ArrayList <Integer> resultadosF= new ArrayList<>();
    static ArrayList <Integer> listapodio= new ArrayList<>();
    static ArrayList <Integer> listavecesganadas= new ArrayList<>();
    
    public static void main(String[] args) {
        
        int respw=1;
        while(respw==1){
            
            Scanner entrada=new Scanner(System.in);
            
            System.out.println("Ingrese el numero de jugadores");
            int participantes=entrada.nextInt();
            
            Jugador jugador= new Jugador(participantes);
            nombres=jugador.Jugadores();
            
            Conductor conductor= new Conductor(participantes,nombres);
            conductor.mostrarConductores();
            int numerodeConductores=conductor.numerodeConductores();
            
            
            Carro carro= new Carro(numerodeConductores);
            listacarros=carro.listaCarros();
            
            Carril carril= new Carril(numerodeConductores);
            carril.mostrarCarriles();
            
            Pista pista= new Pista();
            pista.mostrarPistas();
            pista.mostrarKM();
            int numpistas=pista.numerodepistas();
            int limKM=pista.limitedeKM(),limM=1000*limKM;
            
            System.out.println("\nIniciar el juego? ingrese si o no(en caso de ingresar no te volvera a pedir los datos iniciales)");
            String resp=entrada.next();
            
            if("si".equals(resp)){
                 Podio podio= new Podio();
                int Inumpistas=0,mayor=0,mayorI=0;
               
                for (int j=0;j<numerodeConductores;j++){
                        resultadosF.add(0);           
                        resultados.add(0);
                }
                System.out.println("\nresultados: "+ resultadosF);
                
                while(Inumpistas<numpistas){
                    System.out.println("\npista # "+(Inumpistas+1)+" con "+numerodeConductores+" carriles");
                    
                    
                    while(limM>mayor){
                        float val;
                        int dado,va;
                    
                        for (int i=0;i<numerodeConductores;i++){
                            System.out.println("\n"+nombres.get(i)+ " quieres tirar el dado? ingrese si o no");
                            String resp1=entrada.next();
                            
                            if("si".equals(resp1)){
                                System.out.println("\n"+nombres.get(i)+" tira el dado" );
                                val=(float) Math.random();
                                dado=(int) ((val*6)+1);
                                va=dado*100;
                                resultados.set(i,va);
                                System.out.println("\n"+nombres.get(i)+" sacaste: "+dado);
                                System.out.println("carro "+(i+1)+" avanzaste: "+va+ " m");
                                resultados.get(i);
                                resultadosF.get(i);
                                resultadosF.set(i,(resultados.get(i)+resultadosF.get(i)));
                                if(resultadosF.get(i)>mayor){
                                    mayor=resultadosF.get(i);
                                    mayorI=i;
                                }
                            }      
                            System.out.println("\nel mayor es: "+mayor);
                            System.out.println("\nresultados finales: "+ resultadosF);
                            if(mayor>=limM){
                                    break;
                            }
                        }   
                    }
               
                    Inumpistas++;
                    System.out.println("\nFelicidades "+nombres.get(mayorI)+" llegaste a la meta de la pista # "+Inumpistas);
                    podio.agregarpodio(nombres.get(mayorI));
                    mayor=0;
                    for (int j=0;j<numerodeConductores;j++){
                        resultadosF.set(j,0);           
                        resultados.set(j,0);
                    }
                    listapodio=podio.listapodio();
                    listavecesganadas=podio.contarrepetidospodio(numerodeConductores,nombres,listapodio);
                    int bandera=1,tem;
                    String tem1;
            
                    for(int i=0;i<(nombres.size()-1)&& bandera==1;i++){
                        bandera=0;
                        for(int j=0;j<(nombres.size()-1);j++){
                            if(listavecesganadas.get(j)<listavecesganadas.get(j+1)){
                                bandera=1;
                                tem=listavecesganadas.get(j);
                                tem1=nombres.get(j);
                                listavecesganadas.set(j, listavecesganadas.get(j+1));
                                nombres.set(j, nombres.get(j+1));
                                listavecesganadas.set(j+1, tem);
                                nombres.set(j+1, tem1);
                            }
                        }
                    }
                    System.out.println(nombres+"\n"+listavecesganadas);
                    podio.lugares(nombres,listavecesganadas);
                }
                System.out.println("\nFelicidades Primer lugar para "+nombres.get(0)+" con "+listavecesganadas.get(0)+" Pistas ganadas");
                System.out.println("\nFelicidades Segundo lugar para "+nombres.get(1)+" con "+listavecesganadas.get(1)+" Pistas ganadas");
                System.out.println("\nFelicidades Tercer lugar para"+nombres.get(2)+" con "+listavecesganadas.get(2)+" Pistas ganadas");
                Persistenciadatos persistenciadatos = new Persistenciadatos();
                persistenciadatos.datos(nombres,listavecesganadas);
                respw=0;
            }
        }
    }
}
