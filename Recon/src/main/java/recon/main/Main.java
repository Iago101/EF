package recon.main;

import recon.dao.ReceitaDAO;
import recon.model.Receita;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import recon.controller.InsereReceitas;
import recon.controller.EditaReceitas;
import recon.controller.ListaReceitas;
import recon.controller.DeletaReceitas;

import recon.tela.TelaReceita;


public class Main {
	
	public static void main(String[] args) {
		
		TelaReceita telaReceita = new TelaReceita("Receitas online");
		InsereReceitas controller = new InsereReceitas(telaReceita);
		EditaReceitas controller2 = new EditaReceitas(telaReceita);
		ListaReceitas controller3 = new ListaReceitas(telaReceita);
		DeletaReceitas controller4 = new DeletaReceitas(telaReceita);
		telaReceita.setVisible(true);
	}
	
}
