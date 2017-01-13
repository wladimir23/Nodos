package epn.com;

public class Aplicacion {

	public static void main(String[] args) {

		  Lista lista = new Lista();
		  
		  
		  lista.insertarAlInicio("A");
	      lista.insertarAlInicio("B");
	      lista.insertarAlInicio("c");
	      
		  lista.agregarAlFinal("a");
	      lista.agregarAlFinal("b");
	      lista.agregarAlFinal("C");
	        
	      System.out.println("       <<<<<<<<LISTA>>>>>>>>");
	       lista.listar();
	       
	      System.out.println("\nTamaño");
	      System.out.println(lista.getTamaño());
	      
	      System.out.println("\nConsulta si existe el valor A");
	      System.out.println(lista.buscar("A"));
	       
	      System.out.println("\nConsulta si existe el valor Z");
	      System.out.println(lista.buscar("Z"));
	       
	      System.out.println("\nElimina la lista");
	        lista.eliminar();
	        
	      System.out.println("\nConsulta si la lista está vacia");
	      System.out.println(lista.estaVacia());
	        
	}

}
