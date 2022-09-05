package ifsc;

import java.util.Scanner;

public class ProvaCMain {
	
	private static Double somaVet(Double[] vet) {
		
		Double cont = 0.0;
		
		for (Double double1 : vet) {
			cont += double1;
		}
		
		return cont;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double[] vet8Numeros = new Double[8];
		
		for (int i = 0; i < 8; i++) {
			vet8Numeros[i] = sc.nextDouble();
		}
		
		Double soma = somaVet(vet8Numeros);
		
		System.out.println(soma);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
