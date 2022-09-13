import java.util.Scanner;

public class Jogador {
    private int[] aposta;

    public int[] getAposta() {
	return aposta;
    } 

    public void apostar(int qtdeDezenas, int min, int max) {
	aposta = new int[qtdeDezenas];

	int dezena;
	for (int i = 0; i < qtdeDezenas; i++) {
	    dezena = informarDezena(i, min, max);
	    aposta[i] = dezena;
	}
    }


    private int informarDezena(int i, int min, int max) {
	Scanner scanner = new Scanner(System.in);
	int dezena;
	boolean valido;
	
	do {
	    System.out.printf("Informe a %da. dezena: ", i+1);
	    dezena = scanner.nextInt();
	    
	    valido = dezena >= min && dezena <= max;
	    if (!valido) {
		System.out.printf("Dezena inválida! Dezena deve estar entre %d e %d.%n%n", min, max);
	    } else {
		for (int d : aposta) {
		    if (d == dezena) {
			System.out.println("Dezena repetida!\n");
			valido = false;
			break;
		    }
		}
	    }
	} while(!valido);

	return dezena;
    }
} 