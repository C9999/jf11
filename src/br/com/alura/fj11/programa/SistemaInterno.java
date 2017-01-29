package br.com.alura.fj11.programa;
import br.com.alura.fj11.modelo.Autenticavel;


public class SistemaInterno {
	public void autentica(Autenticavel f) {
		int senha = 123; //no futuro vamos pegar do teclado
		
		if(f.autentica(senha) == true){
			System.out.println("Bem vindo ao sistema");
		}
		else{
			System.out.println("Senha incorreta");
		}
	}
}
