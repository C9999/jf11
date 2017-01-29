package br.com.alura.fj11.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.fj11.modelo.Conta;

//Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um TreeSet
public class TestaTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> conjunto = new TreeSet<>();
		for (int i = 1; i <= 1000; i++) {
			conjunto.add(i);
		}

		for (Integer i : conjunto.descendingSet()) {
			System.out.print(i + " ");
		}
		
		List ss = new ArrayList<>();
		for(int i=1000; i <= 0; i--){
			ss.add(i);
		}
		//System.out.println(ss);
		
		
	}

}


