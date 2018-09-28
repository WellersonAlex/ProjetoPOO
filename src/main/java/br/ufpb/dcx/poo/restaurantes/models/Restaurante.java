package br.ufpb.dcx.poo.restaurantes.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurante implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	
	
	
	public Restaurante() {
		super();
	}


	public Restaurante(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
