package BuilderPattern.EffectiveJava;

/*
 * �ڵ� �� ���� ����
 *  : https://ocwokocw.tistory.com/88
 */
public class EffectiveJava_Main {
	public static void main(String[] args){

		FluentPizza spicyPizza = new FluentPizza.Builder("Plain Dough")
			.setSauce("Spicy sauce")
			.setTopping("Plain topping")
			.build();
		
		FluentPizza hawaiianPizza = new FluentPizza.Builder("Plain Dough")
			.setSauce("Plain sauce")
			.setTopping("Pineapple topping")
			.build();
		
		System.out.println("spicyPizza: " + spicyPizza);
		System.out.println("hawaiianPizza: " + hawaiianPizza);
	}
}
