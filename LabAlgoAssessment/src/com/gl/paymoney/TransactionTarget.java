package com.gl.paymoney;

import java.util.Scanner;

public class TransactionTarget {

	int size;
	int target;
	int targetValue;
	Scanner sc = new Scanner(System.in);

	public void transaction() {

		System.out.println("Enter the total number of transactions");
		size = sc.nextInt();
		System.out.println("Enter the value of transactions");

		int transactionValue[] = new int[size];
		for (int i = 0; i < transactionValue.length; i++) {
			transactionValue[i] = sc.nextInt();
		}
		System.out.println("Transactions value are");
		for (int i = 0; i < transactionValue.length; i++) {
			System.out.print(transactionValue[i] + ", ");
		}

		System.out.println("\nEnter the total number of target");
		int targetSize = sc.nextInt();

		for (int i = 0; i < targetSize; i++) {
			System.out.println("Enter the value of targets");
			targetValue = sc.nextInt();
			int sum = 0;
			int flag = 0;
			for (int j = 0; j < transactionValue.length; j++) {

				sum = sum + transactionValue[j];
				if (sum >= targetValue) {
					System.out.println("Target achieved after " + (j + 1) + " transaction");
					flag = 1;
					break;

				}

			}

			if (flag == 0)
				System.out.println("Sorry!! Target not achieved");
		}
	}
}