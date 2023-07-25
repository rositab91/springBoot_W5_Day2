package componentRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import configBean.GeneralConfigBean;
import entities.Drinks;
import entities.Merch;
import entities.Orders;
import entities.Pizza;
import entities.Table;
import entities.Toppings;
import entities.Toppings.toppings;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class pizzRun implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(GeneralConfigBean.class);

		Pizza margherita = (Pizza) appContext.getBean("margherita");
		Pizza hawaian = (Pizza) appContext.getBean("hawaian");
		Pizza capricciosa = (Pizza) appContext.getBean("capricciosa");

		Drinks water = (Drinks) appContext.getBean("water");
		Drinks coke = (Drinks) appContext.getBean("coke");
		Drinks beer = (Drinks) appContext.getBean("beer");

		Merch notebook = (Merch) appContext.getBean("notebook");
		Merch skirt = (Merch) appContext.getBean("skirt");

		Toppings pineapple = (Toppings) appContext.getBean("topping", toppings.Pineapple);
		Toppings onions = (Toppings) appContext.getBean("topping", toppings.Onions);
		Toppings ham = (Toppings) appContext.getBean("topping", toppings.Ham);
		Toppings cheese = (Toppings) appContext.getBean("topping", toppings.Cheese);
		Toppings olives = (Toppings) appContext.getBean("topping", toppings.Olives);

		// Output Menu
		System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
		System.out.println("---Pizzas---");
		margherita.showPizza();
		hawaian.showPizza();
		capricciosa.showPizza();

		System.out.println("---Toppings---");
		System.out.println(pineapple.toString());
		System.out.println(onions.toString());
		System.out.println(ham.toString());
		System.out.println(cheese.toString());
		System.out.println(olives.toString());

		System.out.println("Drinks------------------------");
		System.out.println(water.toString());
		System.out.println(coke.toString());
		System.out.println(beer.toString());

		System.out.println("Franchise------------------------");
		System.out.println(notebook.toString());
		System.out.println(skirt.toString());
		System.out.println("/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
		System.out.println();


		Table table1 = (Table) appContext.getBean("table", 1, 5, true);
		Orders order1 = (Orders) appContext.getBean("order", 1, table1, 5);
		order1.addProduct(hawaian, "");
		order1.addProduct(capricciosa, "");
		order1.addProduct(water, "sparkle");
		order1.printOrder();

		appContext.close();
	}
}