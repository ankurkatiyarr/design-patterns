package b.creational.c.simple.factory;

public class ShapeFactory {
	public static Shape getShape(ShapeEnum shapeEnum) {
		switch (shapeEnum) {
		case Circle:
			return new Circle();
		case Rectangle:
			return new Rectangle();
		default:
			return null;
		}
	}
}
