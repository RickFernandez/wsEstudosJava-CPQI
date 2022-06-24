package refinado;

import java.io.Serializable;

/*
 * Instituição:			CPQI
 * Projeto: 			Estdos Java
 * Data de Criação:		24/06/2022
 * Criador: 			Henrique Soares
 * Revisão: 			2
 */

@Cabecalho (
		intituicao = "CPQI",
		projeto = "Estudos Java",
		dataCriacao = "24/06/2022",
		criador = "Henrique Soarea",
		revisao = 2
)
@errosRCorrigidos (erros = {"001", "002"})
@SuppressWarnings("serial")
public class Anotacao implements Serializable {
	
	@SuppressWarnings("unused") //Suprime um erro
	private int x;
	
	@Deprecated //Indica que o método pode ser desabilitado em versões futuras
	//@Override --- Sobreescreve o método da classe pai
	public void anotar() {}
}
