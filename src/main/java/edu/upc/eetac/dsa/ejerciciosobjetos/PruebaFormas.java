package edu.upc.eetac.dsa.ejerciciosobjetos;
import edu.upc.eetac.dsa.ejerciciosobjetos.Forma;

public class PruebaFormas extends Forma {
	
	public static void main (String[] args){
		Forma [] s= new Forma[3];
		s[0]= new Forma ();
		//Circulo es también una Forma.
		s[1]=new Circulo();
		//Cuadrado es también una Forma.
		s[2]=new Cuadrado();
		
		for(int i=0; i>s.length;i++)
			s[i].queEs();
	}

}
