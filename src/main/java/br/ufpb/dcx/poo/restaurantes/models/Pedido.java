package br.ufpb.dcx.poo.restaurantes.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String pratoPrincipal;
	private String bebida;
	private String sobremesa;
	private int quantidade;
	private double valorPedido;
	
	public Pedido() {
		super();
	}

	public Pedido(int id, String pratoPrincipal, String bebida, String sobremesa, int quantidade, double valorPedido) {
		this.id = id;
		this.pratoPrincipal = pratoPrincipal;
		this.bebida = bebida;
		this.sobremesa = sobremesa;
		this.quantidade = quantidade;
		this.valorPedido = valorPedido;
	}

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPratoPrincipal() {
		return pratoPrincipal;
	}

	public void setPratoPrincipal(String pratoPrincipal) {
		this.pratoPrincipal = pratoPrincipal;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
