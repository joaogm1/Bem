package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DAO.ConexaoSQL;
import modelo.Cadastro;
import visao.JanelaPrincipal;

public class ControlePrincipal implements ActionListener {

	private JanelaPrincipal jan;
	private Cadastro cad;
	private ConexaoSQL con;

	public ControlePrincipal(JanelaPrincipal jan, Cadastro cad) {
		super();
		this.jan = jan;
		this.cad = cad;
		this.con = new ConexaoSQL();
		this.jan.getButtonIniciar().addActionListener(this);
		this.jan.getButtonGravar().addActionListener(this);
		this.jan.getButtonSair().addActionListener(this);
		this.jan.getButtonConsultar().addActionListener(this);
		this.jan.getButtonBuscar().addActionListener(this);
		this.jan.getButtonVoltar().addActionListener(this);
		this.jan.getButtonSairConsulta().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("iniciar")) {

			this.jan.trocar(this.jan.panel2);
		}
		if (e.getActionCommand().equals("gravar")) {
			String r1 = (String) this.jan.getComboBox1().getSelectedItem();
			String r2 = (String) this.jan.getComboBox2().getSelectedItem();
			String r3 = (String) this.jan.getComboBox3().getSelectedItem();
			String r4 = (String) this.jan.getComboBox4().getSelectedItem();

			String nome = (String) JOptionPane.showInputDialog(null, "Informe seu Nome", "Nome", 1, null, null, "");
			String cpf = (String) JOptionPane.showInputDialog(null, "Informe seu CPF", "CPF", 1, null, null, "");

			cad = new Cadastro(nome, cpf, r1, r2, r3, r4);

			con.cadastrar(cad);
		}
		if (e.getActionCommand().equals("sair")) {

			System.exit(0);
		}
		if (e.getActionCommand().equals("consultar")) {

			JOptionPane.showMessageDialog(null, "Consulter por CPF");
			this.jan.trocar(this.jan.panel3);
		}
		if (e.getActionCommand().equals("buscar")) {
			String cpf = this.jan.getFieldBuscar().getText();

			cad = con.pesquisar(cpf);

			this.jan.getFieldCpf().setText(cad.getCpf());
			this.jan.getFieldNome().setText(cad.getNome());
			this.jan.getFieldR1().setText(cad.getR1());
			this.jan.getFieldR2().setText(cad.getR2());
			this.jan.getFieldR3().setText(cad.getR3());
			this.jan.getFieldR4().setText(cad.getR4());

		}
		if (e.getActionCommand().equals("voltar")) {

			this.jan.trocar(this.jan.panel1);
		}
		if (e.getActionCommand().equals("sairc")) {

			System.exit(0);
		}
		
	}
}