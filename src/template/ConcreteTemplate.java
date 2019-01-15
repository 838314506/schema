package template;

public class ConcreteTemplate extends AbstractTemplate{

	@Override
	protected void abstractMethod() {
		System.out.println("middel method");
	}
	
	public static void main(String[] args) {
		ConcreteTemplate template = new ConcreteTemplate();
		template.templateMethod();
	}

}
