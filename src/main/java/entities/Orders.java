package entities;

import java.util.HashMap;
import java.util.Map.Entry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Orders {
	int orderId;
	Table table;
	HashMap<Products, String> list;
	int customers;
	int atHour;
	int atMinute;
	double total;

	public void addProduct(Products p, String notes) {
		this.getList().put(p, notes);
		sumTotal();
}

public void sumTotal() {
	double sum = 0;
	for (Products p: this.getList().keySet()) {
		sum += p.getPrice();
	}

	double customFee = 1.00;
	sum += customFee * customers;
	setTotal(sum);
}

	public void printOrder() {
		System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/");
		System.out.println("Hour " + this.getAtHour() + ":" + this.getAtMinute());
		System.out.println("Orders list:");
		for (Entry<Products, String> es : this.getList().entrySet()) {
			if (es.getValue().equals("")) {
				System.out.println(es.getKey());
			} else {
				System.out.println(es.getKey() + " Nb:" + es.getValue());
			}
			}

		System.out.println("+ customerFee = 1.00 x " + this.getCustomers() + " customers");
		System.out.println("---Total---");
		System.out.println(this.getTotal() + "$");
		System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/");
		System.out.println();
	}
}