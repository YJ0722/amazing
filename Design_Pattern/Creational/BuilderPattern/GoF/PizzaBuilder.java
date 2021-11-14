package ex01.gof_builder;

public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
	public void makeNewPizza() {
		pizza = new Pizza();
	}
	
	public Pizza getPizza() {
		return pizza;
	}
}
