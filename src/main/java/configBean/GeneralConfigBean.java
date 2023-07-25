package configBean;

import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import entities.Drinks;
import entities.Food;
import entities.Merch;
import entities.Orders;
import entities.Pizza;
import entities.Products;
import entities.Table;
import entities.Toppings;
import entities.Toppings.toppings;

@Configuration
public class GeneralConfigBean {
	toppings[] margherita = { toppings.Tomato, toppings.Cheese };
	toppings[] hawaian = { toppings.Tomato, toppings.Cheese, toppings.Ham, toppings.Pineapple };
	toppings[] capricciosa = { toppings.Tomato, toppings.Cheese, toppings.Olives };

	@Bean
	@Scope("prototype")
	public Food margherita() {
		Pizza p = new Pizza(false, margherita);
		p.setName("Margherita");
		p.setCal(1124);
		p.setPrice(7.50);
		return p;
	}
	
	@Bean
	@Scope("prototype")
		public Food hawaian() {
		Pizza p = new Pizza(false, hawaian);
		p.setName("Hawaian");
		p.setCal(1045);
		p.setPrice(10.00);
		return p;
	}
	
	@Bean
	@Scope("prototype")
	public Food capricciosa() {
		Pizza p = new Pizza(false, capricciosa);
		p.setName("Capricciosa");
		p.setCal(1170);
		p.setPrice(8.75);
		return p;
	}
	
	@Bean
	@Scope("prototype")
	public Food water() {
		Drinks water = new Drinks();
		water.setName("Water");
		water.setCal(0);
		water.setPrice(1.00);
		return water;
	}

	@Bean
	@Scope("prototype")
	public Food coke() {
		Drinks coke = new Drinks();
		coke.setName("Coke");
		coke.setCal(450);
		coke.setPrice(2.30);
		return coke;
	}

	@Bean
	@Scope("prototype")
	public Food beer() {
		Drinks beer = new Drinks();
		beer.setName("Beer");
		beer.setCal(345);
		beer.setPrice(5.75);
		return beer;
	}
	
	@Bean
	@Scope("prototype")
	public Products notebook() {
		Merch notebook = new Merch();
		notebook.setName("Notebook");
		notebook.setPrice(1.25);
		return notebook;
	}
	
	@Bean
	@Scope("prototype")
	public Products skirt() {
		Merch skirt = new Merch();
		skirt.setName("Skirt");
		skirt.setPrice(14.99);
		return skirt;
	}
	
	@Bean
	@Scope("prototype")
	public Food topping(toppings t) {
		Toppings top = new Toppings(t);
		top.setName(top.getToppings().toString());
		switch (top.getName()) {
		case "Olives":
			top.setCal(86);
			top.setPrice(0.99);
			break;
		case "Pineapple":
			top.setCal(24);
			top.setPrice(0.79);
			break;
		case "Onions":
			top.setCal(22);
			top.setPrice(0.69);
			break;
		case "Ham":
			top.setCal(35);
			top.setPrice(0.99);
			break;
		case "Cheese":
			top.setCal(92);
			top.setPrice(0.69);
			break;

		default:
			break;
		}
		return top;
	}

	@Bean
	@Scope("prototype")
	public Table table(int id, int maxCust, boolean isBooked) {
		Table table = new Table(id, maxCust, isBooked);
		return table;
	}

	@Bean
	@Scope("prototype")
	public Orders order(int id, Table table, int customers) {
		Orders orders = new Orders(id, table, new HashMap<Products, String>(), customers, LocalDateTime.now().getHour(),
			LocalDateTime.now().getMinute(), 0.00);
		
		return orders;
	}
}
