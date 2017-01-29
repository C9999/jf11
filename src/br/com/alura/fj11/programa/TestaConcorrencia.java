package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.Conta;

public class TestaConcorrencia {

	public static void main(String[] args) {
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
		
		t1.start();
		t2.start();
		
		//Conta tracy = new Conta("Tracy", 500, 690);
		//FazDeposito acao = new FazDeposito(tracy);
		//Thread t1 = new Thread(acao);
		//Thread t2 = new Thread(acao);
		
		//t1.start();
		//t2.start();
		
		//System.out.println(tracy.getSaldo());
	}

}
