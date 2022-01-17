package recon.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import recon.dao.ReceitaDAO;
import recon.model.Receita;
import recon.tela.TelaReceita;

public class ListaReceitas implements ActionListener {

	private TelaReceita tela = null;
	private Receita modelo = null;
	
	public ListaReceitas(TelaReceita telaReceita) {
		
		tela = telaReceita;
		modelo = new Receita();
		this.tela.getBotao3().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new ReceitaDAO().retrieve(1);
	}

}