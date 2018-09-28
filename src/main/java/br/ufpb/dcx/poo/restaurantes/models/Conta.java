package br.ufpb.dcx.poo.restaurantes.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Conta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private double valor;
	private String formaPagamento;
	
	public Conta() {
		super();
	}

	public Conta(int id, double valor, String formaPagamento) {
		this.id = id;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
