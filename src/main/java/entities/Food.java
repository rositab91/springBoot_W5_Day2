package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public abstract class Food extends Products {
	int Cal;

	@Override
	public String toString() {
		return this.getName() + " Cal " + this.getCal() + " Price " + this.getPrice();
	}
}