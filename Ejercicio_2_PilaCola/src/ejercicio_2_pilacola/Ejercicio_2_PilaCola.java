
package ejercicio_2_pilacola;

import java.util.Scanner;

public class Ejercicio_2_PilaCola {

    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    Pila pi = new Pila();
    Cola co = new Cola();
        System.out.println("Numero de elementos");
    int n = entrada.nextInt();
        System.out.println("Elementos: ");
    String e; 
    
    for(int i = 1; i <= n; i++){
    
        System.out.println("Posicion" + i + ": ");
    e = entrada.next();
    pi.insertar(e);
    
    
    }
        System.out.println(" Elementos de la cola ");
   for(int i =1; i<=n;i++) {
   co.Insertar(pi.Quitar());
       System.out.println("Posicion " + i + ": " + co.quitar());
   
   }
    
    
    
    }  
  }
   
