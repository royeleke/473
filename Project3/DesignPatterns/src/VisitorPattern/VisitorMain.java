package VisitorPattern;

public class VisitorMain {
	
	public static void main(String [] args) {
		Animal[] animals = new Animal[] {
				new Cat(), new Dog(), new Cat()
		};
		
		AnimalVisitor visitor = new AnimalVisitor();
		
		for (Animal animal : animals) {
			animal.accept(visitor);
		}
	}

}
