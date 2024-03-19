package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
			int vetor[] = new int [1000];
			
			Random gerador = new Random();
			for (int i=0;i<1000;i++) {
					vetor[i] = gerador.nextInt(100);
			}
			Thread v1 =  new ThreadVetor(1,vetor);
			v1.start();
			Thread v2 =  new ThreadVetor(2,vetor);
			v2.start();
	}

}
