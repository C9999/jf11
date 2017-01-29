package br.com.alura.fj11.modelo;
public class Conta implements Comparable<Conta>{
	

	private double saldo;
	private int agencia;
	private String nome;

	public Conta(String nome, double saldo, int agencia) {
		this.nome = nome;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void imprime() {
		System.out.println(nome);
		System.out.println(saldo);
		System.out.println(agencia);
	}
	public /*synchronized*/ void deposita(double valor){
		if( valor < 0){
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		}else{
			synchronized (this) {
				this.saldo += valor;
			}
		}
	}
	
	public void saca(double valor){
	    this.saldo -= valor;
    }

	public void atualiza(double taxa){
		this.saldo *= taxa;
		this.saldo += this.saldo * taxa;
    }
	//public abstract void atualiza(double taxa);
	
	public String toString(){
		return "Esse objeto é uma conta com saldo R$ " +this.saldo+ " Dono: " +this.nome+ "\n";
		
	}
	public boolean equals(Object obj) {
        Conta outraConta = (Conta) obj;

        //return this.agencia == outraConta.agencia;
        return this.nome.contains(outraConta.nome);
        
    }

	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}


}
