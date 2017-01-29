package br.com.alura.fj11.programa;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import br.com.alura.fj11.modelo.Conta;

public class TestaOrdenacao {
	public static void main(String[] args){
		Conta ted = new Conta("Ted", 3001, 235);
		Conta tracy = new Conta("Tracy", 2000, 690);
		Conta lilly = new Conta("Lilly", 3000, 444);
		Conta marshalld = new Conta("Mashall", 2500, 445);
		
		List<Conta> contash = new LinkedList<>();
		//List<Conta> contash = new ArrayList<Conta>();
		
		contash.add(ted);
		contash.add(marshalld);
		contash.add(tracy);
		contash.add(lilly);
		
		Collections.sort(contash);
				
		for (Conta conta : contash) {  //System.out.println(contash);
			System.out.println(conta);
	    }
		System.out.println("////////////////////////////");
		
		//Collections.reverse(contash);
		Collections.shuffle(contash);
		//Collections.rotate(contash, 2);
		
		for (Conta conta : contash) {  //System.out.println(contash);
			System.out.println(conta);
	    }
		
		

	}
}
