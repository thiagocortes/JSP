package br.com.thiagocortes.trabalho.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.thiagocortes.trabalho.entidade.Trabalho;
import br.com.thiagocortes.trabalho.jdbc.Conexao;

public class TrabalhoDAO {
	private static Connection con = Conexao.conexao();
	
	public void insert(Trabalho trabalho){
		String sql = "INSERT INTO trabalhos (descricao, disciplina, data_envio, data_entrega, valor, assuntos, nome_equipe, tipo_trabaho) VALUES (?,?,?,?,?,?,?,?)";
		try{
			
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, trabalho.getDescricao());
			stm.setString(2,trabalho.getDisciplina());
			stm.setDate(3, trabalho.getData_envio());
			stm.setDate(4, trabalho.getData_entrega());
			stm.setFloat(5, trabalho.getValor());
			stm.setString(6, trabalho.getAssuntos());
			stm.setString(7,trabalho.getNome_equipe());
			stm.setBoolean(8, trabalho.getTipo_trabaho());
			stm.execute();
			System.out.println("Inserção realizada com sucesso");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public List<Trabalho> listaTrabalhos(){
		
		Trabalho trabalho = new Trabalho();
		List<Trabalho> lista = new ArrayList<Trabalho>();
		
		String sql = "SELECT * FROM trabalhos";
		
		try{
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet resultado = stm.executeQuery();
			
			while(resultado.next()){
				trabalho.setId_trabalho(resultado.getInt("id_trabalho"));
				trabalho.setAssuntos(resultado.getString("assuntos"));
				trabalho.setData_entrega(resultado.getDate("data_entrega"));
				trabalho.setData_envio(resultado.getDate("data_envio"));
				trabalho.setDescricao(resultado.getString("descricao"));
				trabalho.setDisciplina(resultado.getString("disciplina"));
				trabalho.setNome_equipe(resultado.getString("nome_equipe"));
				trabalho.setTipo_trabaho(resultado.getBoolean("tipo_trabaho"));
				
				lista.add(trabalho);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
				
		return lista;
		
	}

}
