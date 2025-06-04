package br.dev.gabriel.tarefas.dao;

import java.io.BufferedReader;
import java.io.FileWriter;
import br.dev.gabriel.tarefas.model.Funcionario;

public class FuncionarioDAO {
	
	private FileWriter fw;
	private BufferedReader bw;
	private FileWriter fr;
	private BufferedReader b;
	
	private String arquivo = "/Users/25132825/tarefasDS1TA/tarefas";
	

	 {
		// TODO Auto-generated constructor stub
	}

	public FuncionarioDAO(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void salvar() {
		try {
			bw.write(Funcionario.toString());
			bw.flush();
			System.out.println(funcionario.getNome() + "gra");
		}
		}

}
