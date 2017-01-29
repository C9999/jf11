package br.com.alura.fj11.programa;

public class BarraDeProgresso implements Runnable{

	@Override
	public void run() {
		for(int i =0; i < 100; i++){
			System.out.println("Barra em progesso");
		}
		
		
	}

}
