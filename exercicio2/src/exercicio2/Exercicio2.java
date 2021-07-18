package exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		int pivo2 = 1;
		int valor1 = 0;
		int valor2 = 0;
		int qtdeVetorOrdenado = 0;
		int vetor[] = {5, 3, 2, 4, 7, 1, 0, 6};
		String vetorOrdenado = "";
		
		do {
			pivo2 = 1;
			qtdeVetorOrdenado = 0;
			for(int pivo1 = 0; pivo1 <= 6; pivo1++) {
				if (vetor[pivo1] > vetor[pivo2]) {
					valor1 = vetor[pivo1];
					valor2 = vetor[pivo2];
					vetor[pivo1] = valor2;
					vetor[pivo2] = valor1;
					qtdeVetorOrdenado++;
				}
				pivo2++;		
			}
		} while(qtdeVetorOrdenado != 0);
		
		for(int index = 0; index <= 7; index++) {
			vetorOrdenado += String.valueOf(vetor[index]);
			
			if (index < 7) {
				vetorOrdenado += " ";
			}
		}
		
		System.out.println("Vetor ordenado: " + vetorOrdenado);
	}

}