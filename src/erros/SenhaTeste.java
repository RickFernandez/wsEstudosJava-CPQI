package erros;

public class SenhaTeste {
	
	static void autenticar(String senha) 
		throws SenhaInvalidaException //Informa ao programa que este é um erro que pode haver na execuçao
	{
		if ("123".equals(senha)) {
			System.out.println("Autenticado");
		} else {
			throw new SenhaInvalidaException("Senha Invalida");
			//Caso a senha informada seja errada, o programa ira lançar(throw) um erro de senha invalida(SenhaInvalidaException)
		}
	}
	
	public static void main(String[] args) {
		
		try {
			autenticar("123");
		} 
		catch(SenhaInvalidaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
