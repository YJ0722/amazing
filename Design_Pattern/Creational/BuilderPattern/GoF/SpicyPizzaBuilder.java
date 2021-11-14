package ex01.gof_builder;


public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Plain Dough");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Hot Sauce");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Plain Topping");
	}
}