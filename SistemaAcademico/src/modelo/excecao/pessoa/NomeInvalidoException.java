package modelo.excecao.pessoa;

public class NomeInvalidoException extends /*normalmente se usa RuntimeException*/ Exception {
	
	private static final long serialVersionUID = -5801136027784894569L;
	
	public NomeInvalidoException(String mensagem) {
		super(mensagem);
	}
}