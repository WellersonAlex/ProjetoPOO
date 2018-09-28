package br.ufpb.dcx.poo.restaurantes.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
