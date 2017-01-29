package br.com.alura.fj11.programa;
import br.com.alura.fj11.excecao.ValorInvalidoException;
import br.com.alura.fj11.modelo.ContaCorrente;


public class TestaDeposita {

	public static void main(String[] args) {
		ContaCorrente carlos = new ContaCorrente("Carlos", 0, 25);
		try{
			carlos.deposita(-200);
		}catch (ValorInvalidoException e) {
			System.out.println("Você tentou depositar um valor inválido. " +e.getMessage());
		}	
	}

}
