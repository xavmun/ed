package iessserpis.ed;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		
		int n;
		int n_max = 10;
		int n_al = (int) (Math.random()*n_max+1);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número aleatorio del 1 al 10: ");
		n = sc.nextInt();
		
		if (n == n_al) {
		System.out.println("Acertaste.");
		}else
		System.out.println("Fallaste.");

	}

}
