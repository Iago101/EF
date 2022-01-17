package recon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import recon.dao.ReceitaDAO;
import recon.model.Receita;
import recon.tela.TelaReceita;

public class EditaReceitas implements ActionListener {

	private TelaReceita tela = null;
	private Receita modelo = null;
	
	public EditaReceitas(TelaReceita telaReceita) {
		
		tela = telaReceita;
		modelo = new Receita();
		this.tela.getBotao2().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		modelo.setNome(this.tela.getCampo1().getText());
		modelo.setDificuldade(this.tela.getCampo2().getText());
		modelo.setNota(Integer.parseInt(this.tela.getCampo3().getText()));
		modelo.setLink(this.tela.getCampo4().getText());
		
		
		new ReceitaDAO().update(modelo);
		
		JOptionPane.showMessageDialog(null, "Receita editada");
	}

}