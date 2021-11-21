package BuilderPattern.EffectiveJava;

// Effective Java�� Builder Pattern
public class FluentPizza {

	private String dough;
	private String sauce;
	private String topping;
	
	private FluentPizza(Builder builder) {
		this.dough = builder.dough;
		this.sauce = builder.sauce;
		this.topping = builder.topping;
	}
	
	// FluentPizza �����ϱ� �� ������ Builder�� ����ؾ� �ϹǷ� static���� ����
	// setter���� ��� ������ ���� �� build �޼ҵ带 ���� ��ü ���� �� ���� 
	// Builder ������ setter �޼ҵ忡�� this�� ��ȯ�ؾ� �޼ҵ� ü�̴� ������ ����� �� ����.
	public static class Builder {
		
		private String dough;
		private String sauce;
		private String topping;

		public Builder(String dough) {
			super();
			this.dough = dough;
		}
		
		public Builder setSauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		
		public Builder setTopping(String topping) {
			this.topping = topping;
			return this;
		}

	     // ���ϴ� ������ ���õǸ� ���������� �� �Լ��� �����ؼ� ��ü�� �ϳ� ������ش�.
		public FluentPizza build() {
			return new FluentPizza(this);
		}
	}

	@Override
	public String toString() {
		return "FluentPizza [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
}