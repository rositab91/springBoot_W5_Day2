package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Toppings extends Food {
	public enum toppings {
		Cheese, Ham, Mushrooms, Olives, Onions, Pineapple, Tomato
	};

	toppings toppings;

	@Override
	public String toString() {
		return this.getName() + " Cal " + this.getCal() + " Price " + this.getPrice();
	}

}

