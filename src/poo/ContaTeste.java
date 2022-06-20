package poo;

public class ContaTeste extends Conta{
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setCliente("Rick");
		conta.setSaldo(10_000.00);
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		
		destino.getCliente();
		destino.getSaldo();
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.00);
		destino.exibeSaldo();
		conta.exibeSaldo();
	}
}
