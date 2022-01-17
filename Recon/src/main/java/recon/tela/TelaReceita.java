package recon.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaReceita extends JFrame {
	
	JLabel texto1 = null;
	JLabel texto2 = null;
	JLabel texto3 = null;
	JLabel texto4 = null;
	
	JTextField campo1 = null;
	JTextField campo2 = null;
	JTextField campo3 = null;
	JTextField campo4 = null;
	
	JButton botao1 = null;
	JButton botao2 = null;
	JButton botao3 = null;
	JButton botao4 = null;
	
	public TelaReceita(String titulo) {
		super(titulo);
		inicializaComponentes();
	}
		
	public void inicializaComponentes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,300, 325, 200);
		
		texto1 = new JLabel("Nome: ");
		texto2 = new JLabel("Dificuldade: ");
		texto3 = new JLabel("Nota: ");
		
		campo1 = new JTextField(20);
		campo2 = new JTextField(20);
		campo3 = new JTextField(20);
		campo4 = new JTextField(20);
		
		botao1 = new JButton("Salvar");
		botao2 = new JButton("Atualizar [PK: nome]");
		botao3 = new JButton("Listar");
		botao4 = new JButton("Deletar [PK: nome]");
		
		JPanel panel = new JPanel();
		panel.add(texto1);
		panel.add(campo1);
		
		panel.add(texto2);
		panel.add(campo2);
		
		panel.add(texto3);
		panel.add(campo3);
		
		panel.add(texto4);
		panel.add(campo4);
		
		panel.add(botao1);
		panel.add(botao2);
		panel.add(botao3);
		panel.add(botao4);
		
		getContentPane().add(panel);
	}

	public JTextField getCampo1() {
		return campo1;
	}

	public void setCampo1(JTextField campo1) {
		this.campo1 = campo1;
	}

	public JTextField getCampo2() {
		return campo2;
	}

	public void setCampo2(JTextField campo2) {
		this.campo2 = campo2;
	}

	public JTextField getCampo3() {
		return campo3;
	}

	public void setCampo3(JTextField campo3) {
		this.campo3 = campo3;
	}
	
	public JTextField getCampo4() {
		return campo3;
	}

	public void setCampo4(JTextField campo3) {
		this.campo3 = campo3;
	}

	public JButton getBotao1() {
		return botao1;
	}
	public void setBotao(JButton botao1) {
		this.botao1 = botao1;
	}	
	
	public JButton getBotao2() {
		return botao2;
	}
	public void setBotao2(JButton botao2) {
		this.botao2 = botao2;
	}	
	
	public JButton getBotao3() {
		return botao3;
	}
	public void setBotao3(JButton botao3) {
		this.botao3 = botao3;
	}	
	
	public JButton getBotao4() {
		return botao4;
	}
	public void setBotao4(JButton botao4) {
		this.botao4 = botao4;
	}	
}
