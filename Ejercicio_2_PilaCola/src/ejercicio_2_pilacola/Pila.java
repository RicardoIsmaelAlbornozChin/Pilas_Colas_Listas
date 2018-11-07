/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_pilacola;

/**
 *
 * @author Admin
 */
public class Pila {
    private Nodo cima;
    
    public Pila(){
    
        cima = null;
    }
    
    public void insertar(String elementos){
    
    Nodo nuevo;
    nuevo = new Nodo(elementos);
    nuevo.siguiente = cima;
    cima = nuevo;
    }
    public String Quitar(){
    String aux = cima.elemento;
        cima = cima.siguiente;
    return aux;
    }
}
