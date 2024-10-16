package modelo.excecao.pessoa;

public class SobrenomeInvalidoException extends Exception {

	private static final long serialVersionUID = -7923334086215838458L;
	
	public SobrenomeInvalidoException(String mensagem) {
		super(mensagem);
	}
}