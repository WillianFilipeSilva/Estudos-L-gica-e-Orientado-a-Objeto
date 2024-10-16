
public class Turma {
	
	private String nome;
	private String codigo;
	private byte cargaHoraria;
	private Aluno[] alunos;
	static final byte TAMANHO_TURMA = 30;
	private byte quantidadeAlunosMatriculados;
	
	public Turma(String nome, String codigoString, byte cargaHoraria) {
		setNome(nome);
		setCodigo(codigo);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[TAMANHO_TURMA];
		quantidadeAlunosMatriculados = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public byte getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(byte cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public boolean inserirAluno(Aluno aluno) {
		
		if(quantidadeAlunosMatriculados == TAMANHO_TURMA)
			return false;
		
		alunos[quantidadeAlunosMatriculados] = aluno;
		quantidadeAlunosMatriculados++;
		
		return true;
	}
	
	public boolean removerAluno(String matricula) {
		
		for(int i = 0; i < TAMANHO_TURMA; i++) {
			
			if(alunos[i].getMatricula().equals(matricula)) {			
				alunos[i] = null;
				quantidadeAlunosMatriculados--;
				reorganizarVetor(alunos, quantidadeAlunosMatriculados);
			}
		}
		return false;
	}
	
	private void reorganizarVetor (Aluno[] alunos, byte posicaoInicial) {
		for ( int j = posicaoInicial; j < TAMANHO_TURMA; j++) {
			if(alunos[j] == null && alunos[j+1] != null) {
				alunos[j] = alunos[j+1];
				alunos[j+1] = null;
			}
		}
	}
}