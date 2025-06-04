package br.dev.gabriel.tarefas.ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.gabriel.tarefas.dao.FuncionarioDAO;

public class FuncionariosListaFrame {
	
	private JLabel labelTitulo;
	private JButton btnNovo;
	private JTable tabelaFuncionarios;
	private DefaultTableModel modelFuncionario;
	private JScrollPane scroll;
	
	private String [] colunas = {"CODIGO", "NOME DO FUNCIONARIO", "CARGO"};
	
	public FuncionariosListaFrame () {
		
	}
	private void criarTela(){
		
		JFrame tela = new JFrame("Lista de funcionarios");
		tela.setSize(600, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		Container painel = tela.getContentPane();
		
		
		labelTitulo = new JLabel("CAdastro de funcionarios");
		labelTitulo.setFont(new Font("Consolas", Font.BOLD, 28));
		labelTitulo.setBounds(10, 10, 400, 40);
		
		
		//obter os dados que serão exibidos na tabela
		FuncionarioDAO dao = new FuncionarioDAO(null);
		
		modelFuncionario = new DefaultTableModel(colunas, 10);
		painel.add(labelTitulo);
		tabelaFuncionarios = new JTable(modelFuncionario);
		scroll = new JScrollPane(tabelaFuncionarios);
		scroll.setBounds(10, 60, 580, 0);
		tabelaFuncionarios.setBounds(10, 60, 580, 340);
		
		
		
		btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 410, 150, 40);
		
		
		
		painel.add(tabelaFuncionarios);
		painel.add(btnNovo);
		tela.setVisible(true);
		
	}
}
