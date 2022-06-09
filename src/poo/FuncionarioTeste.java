package poo;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		f.seNome("Rick");
		String n = f.getNome();
		System.out.println(n);
	}

}
