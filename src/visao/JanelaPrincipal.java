package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	private JComboBox comboBox4;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel1;
	private JButton buttonIniciar;
	private JButton buttonGravar;
	private JButton buttonSair;
	private JTextField fieldBuscar;
	private JButton buttonSairConsulta;
	private JButton buttonBuscar;
	private JButton buttonVoltar;
	private JButton buttonConsultar;
	private JTextField fieldNome;
	private JTextField fieldCpf;
	private JTextField fieldR1;
	private JTextField fieldR2;
	private JTextField fieldR3;
	private JTextField fieldR4;
	private JLabel labelNome;
	private JLabel labelCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.isResizable();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("BemPromotora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		 panel1 = new JPanel();
		contentPane.add(panel1, "name_64307434638300");
		panel1.setLayout(null);

		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(73, 0, 581, 124);
		labelLogo.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/logo-bem.png")));
		panel1.add(labelLogo);

		buttonIniciar = new JButton("Iniciar");
		buttonIniciar.setActionCommand("iniciar");
		buttonIniciar.setBounds(236, 239, 193, 38);
		panel1.add(buttonIniciar);

		buttonConsultar = new JButton("Consultar");
		buttonConsultar.setActionCommand("consultar");
		buttonConsultar.setBounds(236, 290, 193, 43);
		panel1.add(buttonConsultar);

		panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel2, "name_65327120592000");
		panel2.setLayout(null);

		JLabel labelPergunta1 = new JLabel("1 - Qual sua faixa de idade:");
		labelPergunta1.setBounds(7, 36, 247, 25);
		labelPergunta1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel2.add(labelPergunta1);

		comboBox1 = new JComboBox();
		comboBox1.setBounds(7, 65, 147, 25);
		comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox1.addItem("Até 30 anos");
		comboBox1.addItem("De 30 a 50 anos");
		comboBox1.addItem("De 50 a 65 anos");
		comboBox1.addItem("Acima de 65 anos");
		panel2.add(comboBox1);

		JLabel labelPergunta2 = new JLabel("2- Qual seu conv\u00EAnio:");
		labelPergunta2.setBounds(7, 123, 194, 25);
		labelPergunta2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel2.add(labelPergunta2);

		comboBox2 = new JComboBox();
		comboBox2.setBounds(7, 152, 136, 25);
		comboBox2.addItem("INSS");
		comboBox2.addItem("SIAPE");
		comboBox2.addItem("Forças Armadas");
		comboBox2.addItem("Outros");
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(comboBox2);

		JLabel labelPergunta3 = new JLabel("3- Qual sua faixa salarial:");
		labelPergunta3.setBounds(7, 210, 228, 25);
		labelPergunta3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel2.add(labelPergunta3);

		comboBox3 = new JComboBox();
		comboBox3.setBounds(7, 239, 128, 25);
		comboBox3.addItem("Até 2 SM");
		comboBox3.addItem("De 2 a 4 SM");
		comboBox3.addItem("De 4 a 6 SM");
		comboBox3.addItem("Acima de 6 SM");

		comboBox3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(comboBox3);

		JLabel lblNewLabel = new JLabel("4- Por que voc\u00EA realizou o empr\u00E9stimo:");
		lblNewLabel.setBounds(7, 297, 351, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel2.add(lblNewLabel);

		comboBox4 = new JComboBox();
		comboBox4.setBounds(7, 326, 144, 25);
		comboBox4.addItem("Pagar contas");
		comboBox4.addItem("Reforma da Casa");
		comboBox4.addItem("Compra de Carro");
		comboBox4.addItem("Outras");
		comboBox4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel2.add(comboBox4);

		JLabel labelImg = new JLabel("");
		labelImg.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/icon.png")));
		labelImg.setBounds(412, 36, 637, 315);
		panel2.add(labelImg);

		buttonGravar = new JButton("Gravar");
		buttonGravar.setActionCommand("gravar");
		buttonGravar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGravar.setBounds(233, 392, 97, 36);
		panel2.add(buttonGravar);

		buttonSair = new JButton("Sair");
		buttonSair.setActionCommand("sair");
		buttonSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonSair.setBounds(341, 392, 97, 36);
		panel2.add(buttonSair);

		panel3 = new JPanel();
		contentPane.add(panel3, "name_10777453074300");
		panel3.setLayout(null);

		fieldBuscar = new JTextField();
		fieldBuscar.setBounds(50, 390, 129, 22);
		panel3.add(fieldBuscar);
		fieldBuscar.setColumns(10);

		buttonBuscar = new JButton("Buscar");
		buttonBuscar.setActionCommand("buscar");
		buttonBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonBuscar.setBounds(191, 389, 97, 25);
		panel3.add(buttonBuscar);

		buttonVoltar = new JButton("Voltar");
		buttonVoltar.setActionCommand("voltar");
		buttonVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonVoltar.setBounds(327, 388, 97, 25);
		panel3.add(buttonVoltar);

		buttonSairConsulta = new JButton("Sair");
		buttonSairConsulta.setActionCommand("sairc");
		buttonSairConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonSairConsulta.setBounds(434, 388, 97, 25);
		panel3.add(buttonSairConsulta);

		JLabel labelLogoConsulta = new JLabel("");
		labelLogoConsulta.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/imagens/icon.png")));
		labelLogoConsulta.setBounds(442, 91, 201, 219);
		panel3.add(labelLogoConsulta);
		
		fieldNome = new JTextField();
		fieldNome.setEditable(false);
		fieldNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldNome.setBounds(12, 47, 200, 30);
		panel3.add(fieldNome);
		fieldNome.setColumns(10);
		
		fieldCpf = new JTextField();
		fieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldCpf.setColumns(10);
		fieldCpf.setBounds(12, 91, 200, 30);
		fieldCpf.setEditable(false);
		panel3.add(fieldCpf);
		
		fieldR1 = new JTextField();
		fieldR1.setEditable(false);
		fieldR1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldR1.setColumns(10);
		fieldR1.setBounds(12, 126, 200, 30);
		panel3.add(fieldR1);
		
		fieldR2 = new JTextField();
		fieldR2.setEditable(false);
		fieldR2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldR2.setColumns(10);
		fieldR2.setBounds(12, 161, 200, 30);
		panel3.add(fieldR2);
		
		fieldR3 = new JTextField();
		fieldR3.setEditable(false);
		fieldR3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldR3.setColumns(10);
		fieldR3.setBounds(12, 204, 200, 30);
		panel3.add(fieldR3);
		
		fieldR4 = new JTextField();
		fieldR4.setEditable(false);
		fieldR4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldR4.setColumns(10);
		fieldR4.setBounds(12, 238, 200, 30);
		panel3.add(fieldR4);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(229, 62, 56, 16);
		panel3.add(labelNome);
		
		labelCPF = new JLabel("CPF");
		labelCPF.setBounds(232, 91, 56, 16);
		panel3.add(labelCPF);

	}

	

	

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCpf() {
		return fieldCpf;
	}

	public void setFieldCpf(JTextField fieldCpf) {
		this.fieldCpf = fieldCpf;
	}

	public JTextField getFieldR1() {
		return fieldR1;
	}

	public void setFieldR1(JTextField fieldR1) {
		this.fieldR1 = fieldR1;
	}

	public JTextField getFieldR2() {
		return fieldR2;
	}

	public void setFieldR2(JTextField fieldR2) {
		this.fieldR2 = fieldR2;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public JTextField getFieldR3() {
		return fieldR3;
	}

	

	public void setFieldR3(JTextField fieldR3) {
		this.fieldR3 = fieldR3;
	}

	public JTextField getFieldR4() {
		return fieldR4;
	}

	public void setFieldR4(JTextField fieldR4) {
		this.fieldR4 = fieldR4;
	}

	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}

	public JButton getButtonIniciar() {
		return buttonIniciar;
	}

	public void setButtonIniciar(JButton buttonIniciar) {
		this.buttonIniciar = buttonIniciar;
	}

	public JComboBox getComboBox1() {
		return comboBox1;
	}

	public void setComboBox1(JComboBox comboBox1) {
		this.comboBox1 = comboBox1;
	}

	public JComboBox getComboBox2() {
		return comboBox2;
	}

	public JButton getButtonSair() {
		return buttonSair;
	}

	public void setButtonSair(JButton buttonSair) {
		this.buttonSair = buttonSair;
	}

	public void setComboBox2(JComboBox comboBox2) {
		this.comboBox2 = comboBox2;
	}

	public JComboBox getComboBox3() {
		return comboBox3;
	}

	public void setComboBox3(JComboBox comboBox3) {
		this.comboBox3 = comboBox3;
	}

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}

	public JComboBox getComboBox4() {
		return comboBox4;
	}

	public void setComboBox4(JComboBox comboBox4) {
		this.comboBox4 = comboBox4;
	}

	public JButton getButtonGravar() {
		return buttonGravar;
	}

	public void setButtonGravar(JButton buttonGravar) {
		this.buttonGravar = buttonGravar;
	}

	public JPanel getPanel3() {
		return panel3;
	}

	public void setPanel3(JPanel panel3) {
		this.panel3 = panel3;
	}

	public JTextField getFieldBuscar() {
		return fieldBuscar;
	}

	public void setFieldBuscar(JTextField fieldBuscar) {
		this.fieldBuscar = fieldBuscar;
	}

	public JButton getButtonSairConsulta() {
		return buttonSairConsulta;
	}

	public void setButtonSairConsulta(JButton buttonSairConsulta) {
		this.buttonSairConsulta = buttonSairConsulta;
	}

	public JButton getButtonBuscar() {
		return buttonBuscar;
	}

	public void setButtonBuscar(JButton buttonBuscar) {
		this.buttonBuscar = buttonBuscar;
	}

	public JButton getButtonVoltar() {
		return buttonVoltar;
	}

	public void setButtonVoltar(JButton buttonVoltar) {
		this.buttonVoltar = buttonVoltar;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JLabel getLabelCPF() {
		return labelCPF;
	}

	public void setLabelCPF(JLabel labelCPF) {
		this.labelCPF = labelCPF;
	}

	

	// metodo para trocar de janelas
	public void trocar(Component nomePanel) {

		contentPane.removeAll();
		contentPane.add(nomePanel);
		contentPane.repaint();
		contentPane.revalidate();
	}
}
