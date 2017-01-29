package br.com.alura.fj11.modelo;


public class ContaCorrente extends Conta implements Tributavel{

	
	public ContaCorrente(String nome, double saldo, int agencia) {
		super(nome, saldo, agencia);
	}
//	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 0.3);
	}
	//@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
