package DesignPattern;

public class FactoryDesignPattern {
	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		
		// get an object of Rectangle and call its draw method.
		fact shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Rectangle
		shape2.draw();

		// get an object of Square and call its draw method.
		fact shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of square
		shape3.draw();
	}
}

interface fact {
	public void draw();
}

class A implements fact {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}

class B implements fact {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");

	}

}

class ShapeFactory {
	// use getShape method to get object of type shape
	public fact getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new A();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new B();

		}

		return null;
	}
}
