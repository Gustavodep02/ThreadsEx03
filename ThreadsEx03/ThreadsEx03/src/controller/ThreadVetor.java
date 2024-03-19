package controller;

import java.util.*;
public class ThreadVetor extends Thread{
	public ThreadVetor(){
		
	}
	private int num;
	private int [] vetor;
	public ThreadVetor(int num, int [] vetor) {
		this.num = num;
		this.vetor = vetor;
	}
	
	public void run() {
		percorrer();
	}
	private void percorrer() {
		int tamanho = vetor.length;
		long tInicial = System.nanoTime();
		
		if (num %2 == 0) {
			for (int i = 0 ; i < tamanho; i++) {
				int temp = vetor[i] * 2;
			}
			long tFinal = System.nanoTime();
			long tTotal = tFinal - tInicial;
			System.out.println("Thread: "+getId()+"= "+tTotal/1000000.0+" ms");
		}else {
			 for (int item : vetor) {
	                int temp = item * 2;
	            }
		    long tFinal = System.nanoTime();
			long tTotal = tFinal - tInicial;
			System.out.println("Thread: "+getId()+"= "+tTotal/1000000.0+" ms");
		}
		
	}
}
