package b.creational.c.simple.factory;

public class SampleFactoryDemo {
	public static void main(String[] args) {
		Shape shape1 = ShapeFactory.getShape(ShapeEnum.Circle);
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape(ShapeEnum.Rectangle);
		shape2.draw();
	}
}
