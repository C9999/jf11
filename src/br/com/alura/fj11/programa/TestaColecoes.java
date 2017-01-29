package br.com.alura.fj11.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import br.com.alura.fj11.modelo.Conta;

public class TestaColecoes {
	public static void main(String[] args){
		//ArrayList<String> nomes = new ArrayList<String>();
		List<String> nomes = new LinkedList<String>();
		//Set<String> nomes = new HashSet<String>();
		
		nomes.add("Mônica");
		nomes.add("Carlos");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Mônica"));
		
		Collections.sort(nomes);
		System.out.println("Agora ordenado");
		for(int i = 0; i < nomes.size(); i++){
			System.out.println(nomes.get(i));
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta("Carlos", 1500.0, 55);
		Conta c2 = new Conta("Mônicas", 700.0, 60);
		
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(contas);
		for(Conta c : contas){
			System.out.println(c);
			
		}
		//System.out.println(contas.get(0));
		
		
		
	}

}
