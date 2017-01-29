package br.com.alura.fj11.programa;
import br.com.alura.fj11.modelo.ContaCorrente;
import br.com.alura.fj11.modelo.Tributavel;


public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("ContaC", 0, 0);
        cc.deposita(100);
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        //System.out.println(t.getSaldo());
	}
}
