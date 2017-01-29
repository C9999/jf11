package br.com.alura.fj11.programa;
import java.io.*;

import br.com.alura.fj11.modelo.Conta;
import br.com.alura.fj11.modelo.ContaCorrente;

public class TestaString {

	public void imprimeLetraPorLetra(String texto) {
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}

	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
		
		String curso = "Estou estudando Java hoje ";
		curso = curso.replace("j", "k");
		curso = curso.toUpperCase();
		System.out.println(curso);
		boolean teste = curso.contains("JAVA");
		System.out.println(""+teste);
		
		curso = curso.trim();//remove espaço no inicio e fim
		System.out.println(curso);
		
		teste = curso.isEmpty();
		System.out.println(""+teste);
		
		int c = curso.length();
		System.out.println(""+c);
		
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		String a = "Invalida";
		String b = "555";
				
		System.out.println(Integer.parseInt(b)+10);
		//System.out.println(Integer.parseInt(a)+10);
		
		PrintStream saida = System.out;
	    saida.println("ola");
		
	    Conta cconta = new ContaCorrente("CConta", 500, 100);
	    System.out.println(cconta);
	    
	    ////////////////////////////////
	    
	    String x = "Alura";
	       
			
		
	    
	}

}