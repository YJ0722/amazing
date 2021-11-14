package ex01.gof_builder;

/*
 * 코드 및 설명 참고
 *  : https://ocwokocw.tistory.com/88
 */
public class GoF_Main {
	public static void main(String[] args){
		
		Cook cook = new Cook();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		cook.thinkToConstructPizza(spicyPizzaBuilder);
		cook.constructPizza();
		Pizza spicyPizza = spicyPizzaBuilder.getPizza();
		
		PizzaBuilder HawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		cook.thinkToConstructPizza(HawaiianPizzaBuilder);
		cook.constructPizza();
		Pizza hawaiianPizza = HawaiianPizzaBuilder.getPizza();
		
		System.out.println("spicyPizza: " + spicyPizza);
		System.out.println("hawaiianPizza: " + hawaiianPizza);
	}
}
