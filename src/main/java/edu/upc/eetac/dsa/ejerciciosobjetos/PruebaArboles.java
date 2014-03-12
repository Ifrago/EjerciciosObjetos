package edu.upc.eetac.dsa.ejerciciosobjetos;

import edu.upc.eetac.dsa.ejerciciosobjetos.arbol;

public class PruebaArboles {

	public static void main(String args[])
	{
	arbol arbol1 = new arbol(4);
	arbol arbol2 = new arbol("Roble");
	arbol arbol3 = new arbol();
	arbol arbol4 = new arbol(5,"Pino");
	
	
	
	//Printamos los estados de cada árbol
	arbol1.printarEstado();
	arbol2.printarEstado();
	arbol3.printarEstado();
	arbol4.printarEstado();
	
	}
	
}
