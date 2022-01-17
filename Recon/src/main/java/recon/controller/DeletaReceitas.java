package recon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import recon.dao.ReceitaDAO;
import recon.model.Receita;
import recon.tela.TelaReceita;

public class DeletaReceitas implements ActionListener {

	private TelaReceita tela = null;
	private Receita modelo = null;
	
	public DeletaReceitas(TelaReceita telaReceita) {
		
		tela = telaReceita;
		modelo = new Receita();
		this.tela.getBotao4().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		modelo.setNome(this.tela.getCampo1().getText());
		new ReceitaDAO().delete(modelo);
	}

}