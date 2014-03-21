package br.com.thiagocortes.trabalho.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.thiagocortes.trabalho.dao.TrabalhoDAO;
import br.com.thiagocortes.trabalho.entidade.Trabalho;

public class Teste {
	
	public static void main(String[] args) {
		
		busca();
	}
	
	public static void inserirTest(){
		TrabalhoDAO dao = new TrabalhoDAO();
		Trabalho trabalho = new Trabalho();
		
		trabalho.setDescricao("descrição");
		trabalho.setDisciplina("Android");
		trabalho.setAssuntos("Criar sistema de android");
		dao.insert(trabalho);	
	}
	
	public static void busca(){
		List<Trabalho> trabalhos = new TrabalhoDAO().listaTrabalhos();
		
		for(Trabalho trabalho : trabalhos){
			System.out.println(trabalho.getId_trabalho());
			System.out.println(trabalho.getAssuntos());
			System.out.println(trabalho.getDescricao());
			System.out.println(trabalho.getDisciplina());
			System.out.println(trabalho.getNome_equipe());
			System.out.println(trabalho.getTipo_trabaho());
			System.out.println(trabalho.getValor());
			System.out.println(trabalho.getData_entrega());
			System.out.println(trabalho.getData_envio());
		}
		
	}

}
