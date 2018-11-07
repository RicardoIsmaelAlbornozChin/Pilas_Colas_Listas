
package ejercicio_2_pilacola;

public class Cola {
    
protected Nodo Frente;
protected Nodo Fin;


public Cola(){

    Frente = Fin = null;
}
    public void Insertar(String elementos){
    
        Nodo a; 
        a = new Nodo(elementos);
        if (colaVacia()){
        Frente  = a; 
        } else {
        Fin.siguiente = a;
        }
        Fin = a; 
        }
    
    public String quitar(){
    
    String aux;
    if(!colaVacia())
    {
    aux = Frente.elemento;
    Frente = Frente.siguiente;
   }else {
    return "";
    }
    return aux;
    }
    public boolean colaVacia(){
    
    if(Frente == null){
    return true;
    
    }else{
        return false;
    }
    
    }
}
