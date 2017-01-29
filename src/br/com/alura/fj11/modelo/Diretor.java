package br.com.alura.fj11.modelo;

public class Diretor extends Funcionario implements Autenticavel{
	
	public double getBonus(){
		return this.salario * 0.35;
	}
	
	public void cobraRelatorio(){
		System.out.println("Preciso dos relatórios");
	}

//	@Override
	public boolean autentica(int senha) {
		// implementamos a regra aqui
		return false;
	}
}
