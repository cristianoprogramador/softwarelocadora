package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Categoria;

public class CategoriaDAO {
	public static boolean inserir(Categoria categoria) {
		try {
			Connection conexao = Conexao.getConexao();
			String sql = "INSERT INTO categoria (nome, tipo) " + "VALUES (?, ?)";
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, categoria.getNome());
			comando.setString(2, categoria.getTipo());
			comando.execute();
			comando.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean alterar(Categoria categoria) {
		try {
			Connection con = Conexao.getConexao();
			String sql = "UPDATE categoria SET " + "nome = ?, " + "tipo = ? " + "WHERE id = ?";
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, categoria.getNome());
			comando.setString(2, categoria.getTipo());
			comando.setInt(3, categoria.getId());

			int nrLinhas = comando.executeUpdate();

			comando.close();

			return nrLinhas > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean excluir(Integer id) {
		try {
			Connection con = Conexao.getConexao();
			String sql = "DELETE FROM categoria WHERE id = ?";
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setInt(1, id);
			Integer nrLinhas = comando.executeUpdate();
			comando.close();
			return nrLinhas > 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static ArrayList<Categoria> listar() {
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		try {
			Connection conexao = Conexao.getConexao();
			String sql = "SELECT * FROM categoria";
			Statement comando = conexao.createStatement();
			ResultSet resultado = comando.executeQuery(sql);
			while (resultado.next()) {
				Categoria c = new Categoria();
				c.setId(resultado.getInt("id"));
				c.setNome(resultado.getString("nome"));
				c.setTipo(resultado.getString("tipo"));
				categorias.add(c);
			}
			resultado.close();
			comando.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return categorias;
	}
}
