package Filas;

public class FilaString {

	final int N = 3;
	String dados[] = new String[N];
	int ini, fim, count;

	public void init() {
		ini = fim = 0;
	}

	public boolean isEmpty() {

		if (count == 0)
			return true;
		else
			return false;

	}

	public boolean isFull() {
		if (count == N)
			return true;
		else
			return false;
	}

	public void insert(String name) {

		if (isFull())
			System.out.println("Fila Cheia, impossivel inserir");
		else {
			dados[fim] = name;
			fim += 1;
			count++;
		}

	}

	public String remove() {

		String name = dados[ini];
		ini = (ini + 1) % N;
		count--;
		return name;

	}

	public String first() {
		String name = dados[ini];
		return name;

	}

}
