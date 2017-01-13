package epn.com;

public class Nodo {

	private String elemento;
	private Nodo siguiente;
	
	public Nodo (String s, Nodo n){
		
		elemento = s;
		siguiente = n;
	
	}

	public  Nodo(){
        this.elemento = "";
        this.siguiente = null;
    }
	
	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	
	

	
}
