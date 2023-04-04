package FilaAtendimento;

import java.util.Scanner;

import Filas.FilaString;

public class FilaAtendimento {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FilaString filaAtendimento = new FilaString();
		filaAtendimento.init();

		int opcao;

		do {
			System.out.println("1- Inserir paciente\n2- Atender Paciente\n0- Encerrar\n");
			System.out.print("Opcao: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 0:
				if (filaAtendimento.isEmpty()) {
					System.out.println("Atendimento Encerrado.");
					opcao = 3;
				} else
					System.out.println("Pacientes Aguardando Atendimento, impossivel encerrar");
				break;

			case 1:

				System.out.print("Informe o nome do paciente a ser inserido: ");
				input.nextLine();
				String nome = input.nextLine();
				filaAtendimento.insert(nome);

				break;
			case 2:
				if (filaAtendimento.isEmpty())
					System.out.println("Fila Vazia, ninguem a ser atendido");
				else
					System.out.println("Paciente a ser atendido: " + filaAtendimento.remove());
				break;
			default:
				System.out.println("Opcao Invalida");

			}

		} while (opcao != 3);

		input.close();

	}

}
