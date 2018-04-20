package com.Parte2.MOVM970528HNENDR01;

/**
 * La solucion a este problema fue pensada asi:
 * -hacemos un for para ver cuando se repite la primera letra de la cadena.
 * -Del paso anterior obtenemos una subcadena.
 * - esa subcadena la concatenamos n veces.
 * El numero n se calcula dividiendo la longitud d ela cadena entre la subcadena.
 * @author Mario
 *
 */
public class Solution {
	
	public boolean problema (String s) {
		boolean resp = false;
		int length = s.length();
		int count = 0;
		int limite=0;
		int i;
		char primero = s.charAt(1);
		for (i=0;i<length; i++) {
			if(s.charAt(i)==primero) {
				limite = i;
			}
			
		}
		String sub = s.substring(1, limite-1);
		int m= length / (limite-1);
		if( concatena(m,sub) == s) {
			resp=true;
		}
		
		return resp;
	}
	
	public String concatena (int l, String s) {
		String resp ="";
		for (int i=1;i<=l; i++) {
			resp= resp + s;
		}
		return resp;
	}

	public static void main(String[] args) {

	}

}
