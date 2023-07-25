package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Merch extends Products {

	public void showMerch() {
		System.out.println(this.getName() + " Price " + this.getPrice());
	}
}
