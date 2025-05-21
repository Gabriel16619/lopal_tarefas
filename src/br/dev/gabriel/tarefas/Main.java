package br.dev.gabriel.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import br.dev.gabriel.tarefas.model.Tarefa;

public class Main {

	static String caminho = "/Users/25132825/tarefasDS1TA/tarefas";

	public static void main(String[] args) {

		Tarefa tarefa1 = new Tarefa();

		// escreverArquivo();
		// lerArquivo();

	}

	private static void escreverArquivo() {

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			fw = new FileWriter(caminho, false);
			bw = new BufferedWriter(fw);
			// adicionando o conteudo no arquivo
			// bw.append("Senai Jandira");
			// sbw.append("Gabriel");
			bw.append("Cavalcante\n");

			// para add na linha de baixo
			bw.append("XPT0\n");
			bw.append("Help\n");
			bw.append("help me please\n");

			// mandando escrever no arquivo
			bw.flush();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void lerArquivo() {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);

			// criação do objeto
			String retorno = br.readLine();
			// criar o loop
			while (retorno != null) {
				System.out.println(retorno);
				retorno = br.readLine();
			}

			// mensagens de erro para aparecer no pc
		} catch (FileNotFoundException erro) {
			System.out.println("O arquivo não foi encontrado!");
		} catch (Exception erro) {
			System.out.println("Ocoreru um erro!");

		}
		System.out.println("Fim");
	}

}
