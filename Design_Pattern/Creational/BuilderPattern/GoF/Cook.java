package BuilderPattern.GoF;

/*
 * 코드 및 설명 참고
 *  : https://ocwokocw.tistory.com/88
 */
public class Cook {

	private PizzaBuilder pizzaBuilder;
	
	public void thinkToConstructPizza(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void constructPizza() {
		pizzaBuilder.makeNewPizza();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}