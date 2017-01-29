package br.com.alura.fj11.modelo;
abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	private int senha;

	public double getBonificacao() {
		return this.salario * 1.2;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	// outros métodos aqui

}