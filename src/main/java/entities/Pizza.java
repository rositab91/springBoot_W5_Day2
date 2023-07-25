package entities;

import entities.Toppings.toppings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pizza extends Food {
	boolean isLarge = false;
	toppings[] base = { toppings.Tomato, toppings.Cheese };

	public void showPizza() {
		System.out.println(this.name + " (");

		for (toppings t : base) {
			System.out.println(t + ", ");
		}
		System.out.println(this.getName() + ") Cal: " + this.getCal() + " Price " + this.getPrice());
		System.out.println();
	}
}
