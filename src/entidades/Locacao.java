package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Locacao {
	
	private Integer id;
	private Double valor;
	private Date data;
	private ArrayList<ItemLocacao> itensLocacao;
	private Cliente cliente;
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ArrayList<ItemLocacao> getItensLocacao() {
		return itensLocacao;
	}

	public void setItensLocacao(ArrayList<ItemLocacao> itensLocacao) {
		this.itensLocacao = itensLocacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
