package br.com.alura.fj11.excecao;
public class ValorInvalidoException extends RuntimeException {
	 public ValorInvalidoException(double valor) {
         super("Valor invalido: " + valor);
     }
}