package entidades;

public class Jogo extends Item {

	private Integer memoria;
	private String tipo;
	
	public Jogo (Categoria categoria) {
		super(categoria);
	}
	
	public Integer getMemoria() {
		return memoria;
	}
	public void setMemoria(Integer memoria) {
		this.memoria = memoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
