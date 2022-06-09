package poo;

public class Funcionario {
	private String nome;
	private boolean ativo;
	
	public String getNome() {
		return nome;
	}
	
	public void seNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
