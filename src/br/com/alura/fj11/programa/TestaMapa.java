package br.com.alura.fj11.programa;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.fj11.modelo.Conta;
import br.com.alura.fj11.modelo.ContaCorrente;

public class TestaMapa {

    public static void main(String[] args) {
    	Conta c1 = new Conta("Lilly", 3000, 444);
		Conta c2 = new Conta("Mashall", 2500, 445);

		c1.deposita(10000);
        c2.deposita(3000);

        // cria o mapa
        //Map mapaDeContas = new HashMap();
        Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

        // adiciona duas chaves e seus valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor?
        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}