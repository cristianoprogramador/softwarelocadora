package entidades;

public class Filme extends Item {

	private String diretor;
	private Integer duracao;
	
	public Filme(Categoria categoria) {
		super(categoria);
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	
	
}
