package br.com.alura.fj11.programa;

public class Programa implements Runnable {

    private int id;           
  
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }
}
