package edu.upc.eetac.dsa.ejerciciosobjetos;

public class arbol {
	//La clase arbol tiene 2 campos
	public int altura;
	public String tipo;
	
	//La clase arbol tiene 4 constructores
	public arbol ( int nuevoValor){
		altura=nuevoValor;
		tipo=null;
	}
	public arbol( String nuevoValor){
		tipo=nuevoValor;
		altura=0;
	}
	public arbol(){
		tipo=null;
		altura=0;
	}
	public arbol(int nuevaAltura, String nuevoTipo){
		altura=nuevaAltura;
		tipo=nuevoTipo;
	}
	
	
	
	//La clase arbol tiene 1 solo metodo
	public void printarEstado (){
		if(altura!=0 && tipo!=null){
			System.out.println("Un "+tipo+" de "+altura+" metros.");
		}
		if(altura!=0 && tipo==null){
			System.out.println("Un árbol de "+altura+" metros.");
		}
		if(altura==0 && tipo!= null){
			System.out.println("Un "+tipo+".");
		}
		if(altura==0 && tipo==null){
			System.out.println("Un árbol genérico.");
		}
	}

}
