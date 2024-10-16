package modelo.excecao.pessoa;

public class IdadeInvalidoException extends Exception {

	private static final long serialVersionUID = -3403315171899546954L;
	
	public IdadeInvalidoException(String mensagem) {
		super(mensagem);
	}
}