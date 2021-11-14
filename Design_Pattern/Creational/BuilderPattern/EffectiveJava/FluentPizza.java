package ex01.effective_builder;

// Effective Java의 Builder Pattern
public class FluentPizza {

	private String dough;
	private String sauce;
	private String topping;
	
	private FluentPizza(Builder builder) {
		this.dough = builder.dough;
		this.sauce = builder.sauce;
		this.topping = builder.topping;
	}
	
	// FluentPizza 생성하기 전 시점에 Builder를 사용해야 하므로 static으로 선언
	// setter에서 멤버 변수를 저장 후 build 메소드를 통해 객체 생성 후 리턴 
	// Builder 내부의 setter 메소드에서 this를 반환해야 메소드 체이닝 패턴을 사용할 수 있음.
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

	     // 원하는 값드이 세팅되면 최종적으로 이 함수를 실행해서 객체를 하나 만들어준다.
		public FluentPizza build() {
			return new FluentPizza(this);
		}
	}

	@Override
	public String toString() {
		return "FluentPizza [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
}