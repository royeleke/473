package VisitorPattern;

public class AnimalVisitor implements Visitor {

	@Override
	public void visit(Dog dog) { 
		System.out.println("Woof");
	}
	
	@Override
	public void visit(Cat cat) {
		System.out.println("Meow");
	}
}
