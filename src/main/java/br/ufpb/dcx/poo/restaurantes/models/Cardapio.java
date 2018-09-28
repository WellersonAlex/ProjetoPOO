package br.ufpb.dcx.poo.restaurantes.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cardapio implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	private String lanches;
	private String refeicoes;
	private String bebidas;
	private String promocao;
	
	public Cardapio() {
		super();
	}

	public Cardapio(int id,String lanches, String refeicoes, String bebidas, String promocao) {
		this.id = id;
		this.lanches = lanches;
		this.refeicoes = refeicoes;
		this.bebidas = bebidas;
		this.promocao = promocao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanches() {
		return lanches;
	}

	public void setLanches(String lanches) {
		this.lanches = lanches;
	}

	public String getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(String refeicoes) {
		this.refeicoes = refeicoes;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

	public String getPromocao() {
		return promocao;
	}

	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}

}
