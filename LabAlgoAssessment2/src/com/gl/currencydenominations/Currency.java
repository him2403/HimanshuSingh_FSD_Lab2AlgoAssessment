package com.gl.currencydenominations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Currency {

	int size;
	int target;
	int targetValue;
	int totalNoteCount = 0;
	Scanner sc = new Scanner(System.in);

	public void currencyCounter() {

		System.out.println("Enter the total currency denominations");
		size = sc.nextInt();
		System.out.println("Enter the value of currency denominations in random order");

		Integer currencyValue[] = new Integer[size];
		for (int i = 0; i < currencyValue.length; i++) {
			currencyValue[i] = sc.nextInt();
		}
		System.out.println("Currency values before sorting are" + Arrays.toString(currencyValue));
		Arrays.sort(currencyValue, Collections.reverseOrder());
		System.out.println("Currency values after sorting are" + Arrays.toString(currencyValue));

		System.out.println("Enter the amount to pay");
		int amount = sc.nextInt();
		int amt = amount;
		int nc[] = new int[currencyValue.length];
		for (int i = 0; i < currencyValue.length; i++) {
			nc[i] = amt / currencyValue[i];
			amt = amt % currencyValue[i];
			totalNoteCount = totalNoteCount + nc[i];

		}

		for (int i = 0; i < nc.length; i++) {

			if (nc[i] != 0) {
				System.out.println(currencyValue[i] + " : " + nc[i]);

			}
		}
		System.out.println("Minumum number of note to be given to pay " + amount + " Rs : " + totalNoteCount);

	}
}
