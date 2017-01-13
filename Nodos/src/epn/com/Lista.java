package epn.com;

public class Lista {

	protected Nodo inicio;
	protected long tama�o;

	public Lista(){
	
	inicio = null;
	tama�o = 0;
}

public boolean estaVacia(){
	
	return inicio == null;
}


public long getTama�o() {
	return tama�o;
}


public void insertarAlInicio(String elemento){
	
	Nodo nuevo = new Nodo();
	
	nuevo.setElemento(elemento);
	
	if (estaVacia()){
		
		inicio = nuevo;
		
	}
	else {
		
		nuevo.setSiguiente(inicio);
		inicio = nuevo;
		
	}
}


public void agregarAlFinal(String elemento){
	
	Nodo nuevo = new Nodo();
	nuevo.setElemento(elemento);
	
	if(estaVacia()){
	
		inicio = nuevo;
	}
	else{
		
		Nodo aux = inicio;
		
		while(aux.getSiguiente() !=null){
			
			aux = aux.getSiguiente();
		}
		
		aux.setSiguiente(nuevo);
		
	}
	
	tama�o++;
}


public void eliminar(){
   
    inicio = null;
   
    tama�o = 0;
}


public boolean buscar(String elemento){
    
    Nodo aux = inicio;
    
    boolean encontrado = false;
   
    while(aux != null && encontrado != true){
      
        if (elemento == aux.getElemento()){
            
            encontrado = true;
        }
        else{
           
            aux = aux.getSiguiente();
        }
    }
    
    return encontrado;
}


public void listar(){
    
    if (!estaVacia()) {
        
        Nodo aux = inicio;
        
        int i = 0;
       
        while(aux != null){
            
            System.out.println(i + ".[ " + aux.getElemento() + " ]" + " ;  ");
          
            aux = aux.getSiguiente();
            
            i++;
        	}
    	}
	}
}

