package br.com.thiagocortes.trabalho.entidade;

import java.sql.Date;

public class Trabalho {
	private int id_trabalho;
	private String descricao;
	private String disciplina;
	private Date data_envio;
	private Date data_entrega;
	private float valor;
	private String assuntos;
	private String nome_equipe;
	private boolean tipo_trabaho;
	
	public int getId_trabalho() {
		return id_trabalho;
	}
	public void setId_trabalho(int id_trabalho) {
		this.id_trabalho = id_trabalho;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Date getData_envio() {
		return data_envio;
	}
	public void setData_envio(Date data_envio) {
		this.data_envio = data_envio;
	}
	public Date getData_entrega() {
		return data_entrega;
	}
	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getAssuntos() {
		return assuntos;
	}
	public void setAssuntos(String assuntos) {
		this.assuntos = assuntos;
	}
	public String getNome_equipe() {
		return nome_equipe;
	}
	public void setNome_equipe(String nome_equipe) {
		this.nome_equipe = nome_equipe;
	}
	public boolean getTipo_trabaho() {
		return tipo_trabaho;
	}
	public void setTipo_trabaho(boolean tipo_trabaho) {
		this.tipo_trabaho = tipo_trabaho;
	}
}
