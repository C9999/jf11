package br.com.alura.fj11.modelo;

public class Cliente implements Autenticavel {
	private String nome;
	private String endereco;
	
//	@Override
	public boolean autentica(int senha) {
		// implementamos a regra de autenticação
		return false;
	}
	
	
}
