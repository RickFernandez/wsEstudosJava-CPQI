package threads;

/**
 * Uma <code> Ponte </code> representa o elo de
 * ligação etreobjetos Produtores e Consumidores
 * de Informações. Os <i> Produtores </i> utilizam as
 * Pontes para gravar informações e compartilhar
 * essas informações com os <i> Consumidores </i> que lêemm
 * esses dados da Ponte para fazer o processamento.
 *
 * @version 1.3
 * @since 1.0
 * @author Henrique Soares
 * 
 * @see PonteNaoSincronizada
 * @see PonteSincronizada
 */
public interface Ponte {
	
	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * será chamado pelas classes Produtoras de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	
	
	/**
	 * Recupera a informação armazenada na ponte. Será
	 * chamado pelas classes Consumidoras de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
}
