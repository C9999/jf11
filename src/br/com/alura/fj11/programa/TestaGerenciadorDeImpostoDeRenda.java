package br.com.alura.fj11.programa;
import br.com.alura.fj11.modelo.ContaCorrente;
import br.com.alura.fj11.modelo.GerenciadorDeImpostoDeRenda;
import br.com.alura.fj11.modelo.SeguroDeVida;


public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente("Caio", 0, 0);
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
    }
}
