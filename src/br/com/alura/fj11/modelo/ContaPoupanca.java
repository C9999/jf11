package br.com.alura.fj11.modelo;

public class ContaPoupanca extends Conta implements Comparable<Conta> { 

	public ContaPoupanca(String nome, double saldo, int agencia) {
		super(nome, saldo, agencia);
		// TODO Auto-generated constructor stub
	}
//	@Override
	public void atualiza(double taxa) {
		atualiza(taxa * 0.1);
	}
	
	 public int compareTo(ContaPoupanca outra) {
	        return this.getNumero() - outra.getNumero();
	 }
	private int getNumero() {
		return this.getNumero();
		
	}
	

}
	