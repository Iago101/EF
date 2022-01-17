package recon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import recon.dao.ReceitaDAO;
import recon.model.Receita;
import recon.tela.TelaReceita;

public class InsereReceitas implements ActionListener {

	private TelaReceita tela = null;
	private Receita modelo = null;
	
	public InsereReceitas(TelaReceita telaReceita) {
		
		tela = telaReceita;
		modelo = new Receita();
		this.tela.getBotao1().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		modelo.setNome(this.tela.getCampo1().getText());
		modelo.setDificuldade(this.tela.getCampo2().getText());
		modelo.setNota(Integer.parseInt(this.tela.getCampo3().getText()));
		modelo.setLink(this.tela.getCampo4().getText());
		
		
		new ReceitaDAO().create(modelo);
		
		JOptionPane.showMessageDialog(null, "Receita criada");
	}

}