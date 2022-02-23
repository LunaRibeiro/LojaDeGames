package com.generation.lunagames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório!")
	private String nome;
	
	@NotBlank(message = "A descrição é obrigatório!")
	@Size(min = 5, max = 10000, message = "A descrição deve conter entre 5 e 100 caracteres!")
	private String descricao;
	
	@NotBlank(message = "O tipo de Console é obrigatório!")
	private String console;
	
	@NotBlank(message = "Multiplayer é obrigatório!")
	private String multiplayer;
	
	@NotBlank(message = "A quantidade no estoque é obrigatória!")
	private int quantidade;
	
	@NotBlank(message = "A data de lançamento é obrigatória!")
	private String dataLancamento;
	
	@NotBlank(message = "O preço é obrigatório!")
	private BigDecimal preco;
	
	@NotBlank(message = "A foto da capa é obrigatório!")
	private String capa;


	@ManyToOne 
	@JsonIgnoreProperties("produto")
	//@NotBlank
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(String multiplayer) {
		this.multiplayer = multiplayer;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}
}
