
package ClasesyObjetos;

import java.util.Scanner;


public class Main {

public static void main(String [] args){

    Pila pi = new Pila();
    
    String entrada;
    char palabra[];
    Scanner leer = new Scanner (System.in);
    
System.out.println("Ingrese una cadena ");
entrada = leer.nextLine();

palabra =  entrada.toCharArray();
    for(int i = 0; i < palabra.length; i++){
        pi.apilar(palabra[i]);
    }
  
    pi.listar();

    

 


    
    
}




    
}
