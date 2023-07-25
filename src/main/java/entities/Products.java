package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Products {
	double price;
	String name;

	@Override
	public String toString() {
		return this.getName() + " Price " + this.getPrice();
	}
}
