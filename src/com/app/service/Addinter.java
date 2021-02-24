package com.app.service;

import java.util.Scanner;

import com.app.model.Product;
import com.app.service.impl.Service;

public class Addinter implements Service {

	Scanner sc = new Scanner(System.in);

	private Product[] product = null;
	private Product[] cart = null;

	@Override
	public void addProduct() {

		System.out.println("How many product do you want: ");
		int i = sc.nextInt();
		product = new Product[i];
		for (int j = 0; j < product.length; j++) {
			Product p = new Product();
			System.out.println("Enter price: ");
			p.setPrice(sc.nextInt());

			System.out.println("Enter id");
			p.setId(sc.nextInt());

			System.out.println("Enter name");
			p.setProdname(sc.next());

			product[j] = p;
		}
	}

	@Override
	public void viewProduct() {

		System.out.println("================================================");
		System.out.println("Price" + " \t " + "Id" + "\t" + " Name");
		for (int k = 0; k < product.length; k++) {

			Product p = product[k];

			System.out.println(p.getPrice() + "\t" + p.getId() + "\t" + p.getProdname());
		}
		System.out.println("===================================================");

	}

	@Override
	public void addToCart() {

		if (product != null) {
			viewProduct();

			System.out.println("How many products do you want to buy ?");
			int m = sc.nextInt();
			cart = new Product[m];

			for (int j = 0; j < m; j++) {
				System.out.println("Enter product id for buying products");
				Product p = new Product();
				p.setId(sc.nextInt());

				for (int k = 0; k < product.length; k++) {

					if (p.getId() == product[k].getId()) {
						cart[j] = product[k];
					}
				}
			}
		}

		else {
			System.out.println("Invalid");
		}
	}

	@Override
	public void creatBill() {
		System.out.println("===================================================");
		System.out.println("Id" + "   " + "Price" + "   " + "product");

		int finalgrandTotal = 0;
		for (int j = 0; j < cart.length; j++) {
			System.out.println(cart[j].getId() + "  " + cart[j].getPrice() + "  " + cart[j].getProdname());

			finalgrandTotal = finalgrandTotal + cart[j].getPrice();
		}

		System.out.println("Total Bill :" + finalgrandTotal + " Rs");
		System.out.println("===================================================");

	}

}
