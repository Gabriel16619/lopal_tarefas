package br.dev.gabriel.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.dev.gabriel.tarefas.dao.FuncionarioDAO;
import br.dev.gabriel.tarefas.model.Funcionario;

public class FuncionarioFrame {

	private JFrame tela;
	private JLabel nome;
	private JTextField txtSetor;
	private JButton btnSalvar;
	private JButton btnSair;

		public FuncionarioFrame(JFrame tela) {
			criarTela(tela);
		}

		private void criarTela(JFrame parent) {

			JDialog tela = new JDialog(parent);
			tela.setSize(400, 400);
			tela.setTitle("cadastro de Funcionarios");
			tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			tela.setLayout(null);
			tela.setLocationRelativeTo(null);

			JLabel labelNome = new JLabel("Nome:");
			labelNome.setBounds(10, 10, 150, 30);
			JTextField txtNome = new JTextField();
			txtNome.setBounds(10, 40, 200, 30);

			JLabel labelCargo = new JLabel("cargo:");
			labelCargo.setBounds(10, 75, 150, 30);
			JTextField txtCargo = new JTextField();
			txtCargo.setBounds(10, 105, 150, 30);

			JLabel labelSetor = new JLabel("Setor:");
			labelSetor.setBounds(10, 140, 150, 30);
			JTextField txtSetor = new JTextField();
			txtSetor.setBounds(10, 170, 200, 30);

			JButton btnSalvar = new JButton("savar");
			btnSalvar.setBounds(10, 250, 150, 40);

			btnSalvar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Funcionario f = new Funcionario();
					f.setNome(txtNome.getText());
					f.setCargo(txtCargo.getText());
					f.setSetor(txtSetor.getText());

					JOptionPane.showMessageDialog(tela, f.getNome() + "gravado com sucesso!");

					txtNome.setText(null);
					txtCargo.setText(null);
					txtSetor.setText(null);
					txtNome.requestFocus();
				}
			});

			btnSair.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					int resposta = JOptionPane.showConfirmDialog(tela, "Sair do sistema");
					if (resposta == 0)
						;
					System.exit(JFrame.EXIT_ON_CLOSE);

					Container painel = tela.getContentPane();
					painel.add(labelNome);
					painel.add(txtNome);
					painel.add(labelCargo);
					painel.add(txtCargo);
					painel.add(labelSetor);
					painel.add(txtSetor);
					painel.add(btnSalvar);

					tela.setVisible(true);

				}
			});
		}

	}

}
