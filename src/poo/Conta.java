package poo;

public class Conta {

	private String cliente;
	private double saldo;
	
	
	
	public Conta() {
		super();
	}

	public Conta(String cliente, double saldo) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo e: " + saldo);
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
