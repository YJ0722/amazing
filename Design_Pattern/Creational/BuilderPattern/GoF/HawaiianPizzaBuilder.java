package ex01.gof_builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Plain Dough");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Plain Sauce");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pineapple");
	}
}
