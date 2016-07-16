package foodTruck;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import javax.swing.text.DefaultCaret;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Janela3CadastroEmpresa extends Janela0ModeloJanelaParaTodos {
	private JTextField txtFNomeFoodTruck;
	private JTextField txtTelefoneFood;
	private JTextField txtCNPJ;
	private JTextField txtNomeProprietario;
	private JTextField txtEmailPropietario;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtTelProprietario;
	private MaskFormatter ftmTelefone;	//Atributo formatador para telefone 
	private JFormattedTextField foneEmpresa = new JFormattedTextField(ftmTelefone);
	private JFormattedTextField foneProprietario = new JFormattedTextField(ftmTelefone);

	public Janela3CadastroEmpresa(){
		
		JLabel lblDadosDoFoodtruck = new JLabel("Dados do FoodTruck");
		lblDadosDoFoodtruck.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDadosDoFoodtruck.setBounds(139, 129, 191, 42);
		getContentPane().add(lblDadosDoFoodtruck);
		
		JLabel lblNomeFoodTruck = new JLabel("Nome FoodTruck");
		lblNomeFoodTruck.setToolTipText("");
		lblNomeFoodTruck.setBounds(139, 188, 106, 29);
		getContentPane().add(lblNomeFoodTruck);
		
		JLabel lblTelefoneFood = new JLabel("Telefone ");
		lblTelefoneFood.setBounds(139, 252, 59, 29);
		getContentPane().add(lblTelefoneFood);
		
		
		JLabel lblCNPJfood = new JLabel("CNPJ");
		lblCNPJfood.setBounds(139, 314, 32, 30);
		getContentPane().add(lblCNPJfood);
		
		JComboBox ComboTipoCozinha = new JComboBox();
		ComboTipoCozinha.setBounds(139, 390, 151, 29);
		ComboTipoCozinha.addItem("Tipo de cozinha");
		ComboTipoCozinha.addItem("TIPO 1");
		ComboTipoCozinha.addItem("TIPO 2");
		ComboTipoCozinha.addItem("TIPO 3");
		
		getContentPane().add(ComboTipoCozinha);
		
		txtFNomeFoodTruck = new JTextField();
		txtFNomeFoodTruck.setBounds(139, 221, 151, 20);
		getContentPane().add(txtFNomeFoodTruck);
		txtFNomeFoodTruck.setColumns(10);
		

		// TELEFONE EMPRESA COM MÁSCARA
		
			try {
				ftmTelefone = new MaskFormatter("(##)####-####");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			foneEmpresa = new JFormattedTextField(ftmTelefone);
	        ftmTelefone.setValidCharacters("0123456789");  
	        foneEmpresa.setColumns(10); 
	        foneEmpresa.setBounds(139, 280, 118, 20);
	        getContentPane().add(foneEmpresa);
		
		
		txtCNPJ = new JTextField();
		txtCNPJ.setBounds(139, 339, 86, 20);
		getContentPane().add(txtCNPJ);
		txtCNPJ.setColumns(10);
		
		JLabel lblDadosDoProprietrio = new JLabel("Dados do Propriet\u00E1rio");
		lblDadosDoProprietrio.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDadosDoProprietrio.setBounds(487, 129, 267, 42);
		getContentPane().add(lblDadosDoProprietrio);
		
		JLabel lblNomeProprietario = new JLabel("Nome");
		lblNomeProprietario.setBounds(487, 195, 46, 14);
		getContentPane().add(lblNomeProprietario);
		
		JLabel lblEmailProprietario = new JLabel("E-mail");
		lblEmailProprietario.setBounds(487, 259, 59, 14);
		getContentPane().add(lblEmailProprietario);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(487, 322, 46, 14);
		getContentPane().add(lblCPF);
		
		JLabel lblNewLabel_6 = new JLabel("RG");
		lblNewLabel_6.setBounds(637, 322, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblTelProprietario = new JLabel("Telefone");
		lblTelProprietario.setBounds(487, 377, 59, 14);
		getContentPane().add(lblTelProprietario);
		
		txtNomeProprietario = new JTextField();
		txtNomeProprietario.setBounds(487, 221, 151, 20);
		getContentPane().add(txtNomeProprietario);
		txtNomeProprietario.setColumns(10);
		
		txtEmailPropietario = new JTextField();
		txtEmailPropietario.setBounds(487, 280, 151, 20);
		getContentPane().add(txtEmailPropietario);
		txtEmailPropietario.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(487, 339, 118, 20);
		getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		txtRG = new JTextField();
		txtRG.setBounds(637, 339, 86, 20);
		getContentPane().add(txtRG);
		txtRG.setColumns(10);
		
		txtTelProprietario = new JTextField();
		txtTelProprietario.setBounds(487, 394, 106, 20);
		//getContentPane().add(txtTelProprietario);
		txtTelProprietario.setColumns(10);
		
		foneProprietario = new JFormattedTextField(ftmTelefone);
        ftmTelefone.setValidCharacters("0123456789");  
        foneProprietario.setColumns(10); 
        foneProprietario.setBounds(487, 394, 106, 20);
        getContentPane().add(foneProprietario);
		
		JRadioButton rdbtnVocAceitaOs = new JRadioButton("Voc\u00EA aceita os termos blablabla");
		rdbtnVocAceitaOs.setBounds(52, 530, 219, 23);
		getContentPane().add(rdbtnVocAceitaOs);
		
		JLabel lblInformeOsDados = new JLabel("Preencha os campos");
		lblInformeOsDados.setFont(new Font("Sitka Text", Font.PLAIN, 26));
		lblInformeOsDados.setBounds(271, 76, 276, 42);
		getContentPane().add(lblInformeOsDados);
		
		
		
		JTextArea txtTermos = new JTextArea();
		txtTermos.setText("Voc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita\r\nVoc\u00EA aceita os termos por que voce aceita");
		txtTermos.setEditable(false);
		txtTermos.setToolTipText("");
		DefaultCaret caret = (DefaultCaret)txtTermos.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

		JScrollPane	scrollpane = new JScrollPane();
		scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollpane.add(txtTermos);
		scrollpane.setViewportView(txtTermos);
		scrollpane.setBounds(52, 441, 260, 82);
		scrollpane.setVisible(true);
			
		
		getContentPane().add(scrollpane);
		
		//-----------------------------------------------------------------
		//BOTÃO CONFIRMAR E ENVIAR 
		JButton btnConfirmar = new JButton("Enviar solicitação");
		btnConfirmar.addActionListener(new ActionListener() {
			
			//VALIDA CPF
			public void actionPerformed(ActionEvent e) {
				String CPF = txtCPF.getText();
				
				if (ValidaCpf.isCPF(CPF) == true){
				       System.out.printf("%s\n", ValidaCpf.imprimeCPF(CPF));
				}else {JOptionPane.showMessageDialog(null,"Erro, CPF invalido !!!\n");
				txtCPF.requestFocus(); 
				}
			}
		});
		
		btnConfirmar.setBounds(516, 500, 142, 23);
		getContentPane().add(btnConfirmar);
		
		}
}
