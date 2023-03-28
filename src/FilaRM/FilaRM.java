package FilaRM;

import java.util.Scanner;

import Filas.FilaInt;

public class FilaRM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FilaInt filaAlunos = new FilaInt();
		int opcao;

		filaAlunos.init();

		do {
			System.out.println("1 - Inserir Aluno na Fila \n2 - Retirar Aluno da Fila \n0 - Encerrar\n ");
			opcao = input.nextInt();

			switch (opcao) {

			case 0:
				if (filaAlunos.isEmpty()) {
					System.out.println("Encerrado");
					opcao = 3;
				} else
					System.out.println("Nao foi possivel encerrar, fila nao esta vaizia");
				break;

			case 1:
				System.out.print("Informe o RM a ser inserido: ");
				int rm = input.nextInt();
				filaAlunos.enqueue(rm);
				break;
			case 2:
				System.out.println("Aluno retirado da fila: " + filaAlunos.dequeue());
				break;
			default:
				System.out.println("Opcao Invalida\n");

			}
		} while (opcao != 3);

		input.close();
	}

}
