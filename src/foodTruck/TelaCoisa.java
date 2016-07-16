package foodTruck;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaCoisa {

	/**
	 * @wbp.parser.entryPoint
	 */
	public void Formulario() {
		JFrame frmCoisa = new JFrame();
		frmCoisa.getContentPane().setEnabled(false);
		frmCoisa.setSize(152, 367);
		frmCoisa.setLocationRelativeTo(null);
		frmCoisa.setResizable(false);
		frmCoisa.setVisible(true);
		frmCoisa.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 1, 124, 316);
		frmCoisa.getContentPane().add(panel);

		int height = 30;

		JLabel jlbHome = new JLabel("Home");
		jlbHome.setVerticalAlignment(SwingConstants.TOP);
		
		jlbHome.setBackground(Color.darkGray);
		jlbHome.setForeground(Color.white);
		jlbHome.setBounds(panel.getX(), 0, panel.getWidth(), height);
		panel.add(jlbHome);

		JLabel jlbProcurar = new JLabel("Procurar");
		jlbProcurar.setBackground(Color.darkGray);
		jlbProcurar.setForeground(Color.white);
		jlbProcurar.setBounds(panel.getX(), jlbHome.getY() + height, panel.getWidth(), height);
		panel.add(jlbProcurar);

		JLabel jlbCadastrar = new JLabel("Cadastrar");
		jlbCadastrar.setBackground(Color.darkGray);
		jlbCadastrar.setForeground(Color.white);
		jlbCadastrar.setBounds(panel.getX(), jlbProcurar.getY() + height, panel.getWidth(), height);
		panel.add(jlbCadastrar);

		JLabel jlbLogin = new JLabel("Login");
		jlbLogin.setBackground(Color.darkGray);
		jlbLogin.setForeground(Color.white);
		jlbLogin.setBounds(panel.getX(), jlbCadastrar.getY() + height, panel.getWidth(), height);
		panel.add(jlbLogin);

	}

	public static void main(String[] args) {
		TelaCoisa telaCoisa = new TelaCoisa();
		telaCoisa.Formulario();
	}
}
