package com.class16_2;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Start Range");

		int start = scan.nextInt();
		System.out.println("End Range");
		int end = scan.nextInt();

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}

		}
		System.out.println("Sum of evens = " + sumEven);

		System.out.println("Sum of odds = " + sumOdd);

		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. //Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. // Whenever user done
		 * with payments tell them "Thank you for shopping!" Scanner will take an input
		 * from user item=first input from user price=second input from user
		 * 
		 * money=continues input from user total=All money loop until total matches the
		 * price
		 */
		Scanner scan1 = new Scanner(System.in);

		int price = 200;
		int difference = price;
		System.out.println("What do you want to buy");
		String item = scan1.next();

		System.out.println("Please enter payment");
		int amount = scan1.nextInt();
		difference = difference - amount;

		while (difference > 0) {
			System.out.println("Please enter payment");
		amount = scan1.nextInt();

		difference = difference - amount;
		}
		
		System.out.println("Thank you for your payment");

	}
	//another way to do it
    Scanner scan;
    String item;
    double price;
    double payment;
    double totalPayment = 0;
    double balance;
    double change;

    scan = new Scanner(System.in);
    System.out.println("Please enter your item");
    item = scan.nextLine();

    System.out.println("Please enter the item price");
    price = scan.nextDouble();

    do {
        System.out.println("Please enter your payment amount");
        payment = scan.nextDouble();

        totalPayment = totalPayment + payment;

        if (totalPayment > price) {
            change = totalPayment - price;
            System.out.println("Please take your change " + change);
            break;
        } else if (totalPayment < price) {
            balance = price - totalPayment;
            System.out.println("Please enter more $" + balance);
        }
    } while (totalPayment != price);
    System.out.println("Thank you for shopping!");

}



	

}
