package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.Conta;

public class FazDeposito implements Runnable{

	private final Conta conta;
	public FazDeposito(Conta conta){
		this.conta = conta;
	}
	@Override
	public void run() {
		conta.deposita(100.0);
		
	}

}
