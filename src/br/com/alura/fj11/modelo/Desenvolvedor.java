package br.com.alura.fj11.modelo;

public class Desenvolvedor extends Funcionario implements Autenticavel{
	
	public double getBonus(){
		return this.salario * 0.15;
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