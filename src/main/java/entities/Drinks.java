package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Drinks extends Food {

	public void showDrinks() {
		System.out.print(this.getName() + " Cal: " + this.getCal() + " Price " + this.getPrice());
		System.out.println();
	}
}
