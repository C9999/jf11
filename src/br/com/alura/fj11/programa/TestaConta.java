package br.com.alura.fj11.programa;
import br.com.alura.fj11.modelo.Conta;


public class TestaConta {
	public static void main(String[] args) {
		Conta carlos = new Conta("Carlos", 2000.0, 6513);
		Conta monica = new Conta("Carlos", 3000.0, 6913);
		//conta.setNome("Carlos");
		carlos.imprime();
		carlos.deposita(100.0);
		System.out.println(carlos.getSaldo());
		System.out.println(carlos);
		
		boolean t = carlos.equals(monica);
		System.out.println(t);
		
	}
}
/*
public class TestaComparacaoConta {

public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(6, "Leonardo");
    ContaCorrente cc2 = new ContaCorrente(6, "Leonardo");

    if (cc == cc2)
        System.out.println("mesmo objeto");
    else 
        System.out.println("outro objeto");

    if (cc.equals(cc2))
        System.out.println("objeto equivalente");
    else 
        System.out.println("objeto nao equivalente");
}
}
*/