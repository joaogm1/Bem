package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Cadastro;
import visao.JanelaPrincipal;

public class ConexaoSQL {

	private static Connection conexao;
	private static String status;
	private Connection con = null;
	Cadastro cad = new Cadastro(null, null, null, null, null, null);
	JanelaPrincipal jan;

	public ConexaoSQL() {

	}

	public static void abrirConexao() {

		try {
			conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BemPromotoraa", "joao",
					"12345");

		} catch (Exception e) {
			// TODO: handle exception
		}

		if (conexao != null) {

			status = "Status--->Conectando com sucesso!";
		}

		else {
			status = "Status--->Não foi possível realizar a conexão";

		}
	}

	public static boolean fecharConexao() {

		try {
			conexao.close();
			System.out.println("Conexão encerrada");
			return true;

		} catch (SQLException e) {
			return false;
		}
	}

	public static void ObterStatusConexao() {
		System.out.println(status);
	}

	public static Connection getConexao() {
		return conexao;
	}

	public static void setConexao(Connection conexao) {
		ConexaoSQL.conexao = conexao;
	}

	public static String getStatus() {
		return status;
	}

	public static void setStatus(String status) {
		ConexaoSQL.status = status;
	}
	//metodo para cadastrar
	public boolean cadastrar(Cadastro cad) {
		ConexaoSQL.abrirConexao();
		ConexaoSQL.getConexao();
		con = ConexaoSQL.getConexao();

		if (con != null) {
			String sql = "insert into cliente (cpf,nome,respostaUm,respostaDois,respostaTres,respostaQuatro) values (?,?,?,?,?,?)";

			PreparedStatement prepS = null;
			try {
				prepS = con.prepareStatement(sql);

				prepS.setString(1, cad.getCpf());
				prepS.setString(2, cad.getNome());
				prepS.setString(3, cad.getR1());
				prepS.setString(4, cad.getR2());
				prepS.setString(5, cad.getR3());
				prepS.setString(6, cad.getR4());
				int res = prepS.executeUpdate();

				if (res == 1) {
					ConexaoSQL.fecharConexao();
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
					return true;
				} else {
					ConexaoSQL.fecharConexao();
					return false;
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "FALHA:Usuário Já cadastrado");
			}

		}
		return false;
	}
	
	//metodo para pesquisar
	public Cadastro  pesquisar(String cpf) {
		String cpfC = null;
		String nome = null;
		String r1 = null;
		String r2 = null;
		String r3 = null;
		String r4 = null;
		Cadastro cadastro = null;
		ConexaoSQL.abrirConexao();
		ConexaoSQL.getConexao();
		con = ConexaoSQL.getConexao();

		if (con != null) {
			String sql = "select * from cliente   where  cpf= ?";

			PreparedStatement prepS = null;
			try {
				prepS = con.prepareStatement(sql);
				prepS.setString(1, cpf);
				ResultSet res = prepS.executeQuery();
				while (res.next()) {

				cpfC = res.getString("cpf");
				nome=	res.getString("nome");
				r1=	res.getString("respostaUm");
				r2=	res.getString("respostaDois");
				r3=	res.getString("respostaTres");
				r4=	res.getString("respostaQuatro");
				cadastro = new Cadastro(cpfC,nome,r1,r2,r3,r4);
				}
				
				res.close();
				prepS.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Usuario Não encontrado");
			}

		}
		
		
		
		return cadastro;
		
		
	}

}
