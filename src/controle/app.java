package controle;

import DAO.ConexaoSQL;
import modelo.Cadastro;
import visao.JanelaPrincipal;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cadastro cad = new Cadastro(null, null, null, null, null, null);
		JanelaPrincipal j = new JanelaPrincipal();
		j.setVisible(true);
		ControlePrincipal con = new ControlePrincipal(j, cad);

	}

}
