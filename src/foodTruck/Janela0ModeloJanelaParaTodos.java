package foodTruck;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.w3c.dom.events.MouseEvent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;

public class Janela0ModeloJanelaParaTodos extends JFrame implements MouseListener {

	private JPanel jPanelSideBar, jPanelPrincipal;
	private JLayeredPane jLayeredPane;
	private boolean sideBarAtiva = false;
	private final String BUTTON_SIDEBAR = "buttonSideBar", BUTTON_CADASTRAR = "buttonCadastrar",
			BUTTON_AREA_RESTRITA = "buttonAreaRestrita",BUTTON_LOGIN = "Login";

	public Janela0ModeloJanelaParaTodos() {
		getContentPane().setBackground(Color.WHITE);
		// Criando a janela
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		getContentPane().setLayout(null);
		this.setIconImage(LogoImagem.imagem());

		jLayeredPane = new JLayeredPane();
		jLayeredPane.setBounds(0, 0, getWidth(), getHeight());
		jLayeredPane.setLayout(null);
		add(jLayeredPane);

		jPanelPrincipal = new JPanel();
		jPanelPrincipal.setBounds(0, 0, getWidth(), getHeight());
		jPanelPrincipal.setLayout(null);
		jLayeredPane.add(jPanelPrincipal, 0);

		// botao cadastrar
	//	RoundButton btnCadastrar = new RoundButton("Cadastrar", false, false, 20, Color.RED,Color.WHITE);
	//	btnCadastrar.setBounds(69, 67, 140, 57);
	//	btnCadastrar.setText("sadinasdio");
		//btnCadastrar.setName(BUTTON_CADASTRAR);
	//	btnCadastrar.addMouseListener(this);
		//jPanelPrincipal.add(btnCadastrar);

		// Botão para a area restrita
		JButton areaRestrita = new JButton("Area restrita");
		areaRestrita.setBackground(Color.WHITE);
		areaRestrita.setBounds(664, 61, 120, 25);
		areaRestrita.setText(BUTTON_AREA_RESTRITA);
		areaRestrita.setName(BUTTON_AREA_RESTRITA);
		areaRestrita.addMouseListener(this);
		
		jPanelPrincipal.add(areaRestrita);

		JLabel lblSideBar = new JLabel("");
		lblSideBar.setIcon(new ImageIcon(Janela0ModeloJanelaParaTodos.class.getResource("/recurso/sidebar.png")));
		lblSideBar.setBounds(10, 0, 56, 47);
		lblSideBar.setName(BUTTON_SIDEBAR);
		lblSideBar.addMouseListener(this);
		jPanelPrincipal.add(lblSideBar);

		JLabel lblHome = new JLabel("");
		lblHome.setIcon(new ImageIcon(Janela0ModeloJanelaParaTodos.class.getResource("/recurso/logoHome.png")));
		lblHome.setBounds(389, 0, 56, 47);
		jPanelPrincipal.add(lblHome);

		JLabel lblTopo = new JLabel("New label");
		lblTopo.setIcon(new ImageIcon(Janela0ModeloJanelaParaTodos.class.getResource("/recurso/oTopo.png")));
		lblTopo.setBounds(0, 0, 800, 50);
		jPanelPrincipal.add(lblTopo);

		
		
		int height = 30;

		jPanelSideBar = new JPanel();
		jPanelSideBar.setBounds(0, lblTopo.getY() + lblTopo.getHeight(), 100, jLayeredPane.getHeight());
		jPanelSideBar.setLayout(null);
		jPanelSideBar.setVisible(false);
		
		jLayeredPane.add(jPanelSideBar, 0);
		JLabel jlbHome = initJLabel("Home", jPanelSideBar.getX(), 0, jPanelSideBar.getWidth(), height, Color.darkGray,
				Color.white);
		JLabel jlbProcurar = initJLabel("Procurar", jPanelSideBar.getX(), jlbHome.getY() + height,
				jPanelSideBar.getWidth(), height, Color.darkGray, Color.white);
		JLabel jlbCadastrar = initJLabel("Cadastrar", jPanelSideBar.getX(), jlbProcurar.getY() + height,
				jPanelSideBar.getWidth(), height, Color.darkGray, Color.white);
		jlbCadastrar.setName(BUTTON_CADASTRAR);
		JLabel jlbLogin = initJLabel("Login", jPanelSideBar.getX(), jlbCadastrar.getY() + height,
				jPanelSideBar.getWidth(), height, Color.darkGray, Color.white);
		jlbLogin.setName(BUTTON_LOGIN);

	}

	public JLabel initJLabel(String title, int x, int y, int width, int height, Color colorBackground,
			Color colorForeground) {
		JLabel jLabel = new JLabel(title);
		jLabel.setBackground(colorBackground);
		jLabel.setForeground(colorForeground);
		jLabel.setBounds(x, y, width, height);
		jLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		jLabel.setOpaque(true);
		jPanelSideBar.add(jLabel);
		jLabel.addMouseListener(this);
		return jLabel;
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		
		
		try{
			
		if (((Component) e.getSource()).getName().equals(BUTTON_SIDEBAR)) {
			if (sideBarAtiva == false) {
				jPanelSideBar.setVisible(true);
				System.out.println("AQUi");
				sideBarAtiva = true;
			} else {
				jPanelSideBar.setVisible(false);
				sideBarAtiva = false;
				System.out.println("!AQUi");
			}
		} else if (((Component) e.getSource()).getName().equals(BUTTON_CADASTRAR)) {
			Janela3CadastroEmpresa obj = new Janela3CadastroEmpresa();
			
		} else if (true) {

			JanelaLoguin jl = new JanelaLoguin();
			jl.Login();
		}
		
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Ocorreu um erro no evento mouseClicked!\nErro: "+ex.getMessage()+"\n"+ex.getLocalizedMessage()+"\n"+ex.getCause(),"Erro",0);
		}
			

	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	

	}
}
