package a.solid.design.patterns.lsp;

public class LspDemo {
	public static void useIt(Rectangle rectangle) {
		double width = rectangle.getWidth();
		rectangle.setHeight(10);

		// lsp got violated here.
		System.out.println("Expected area: " + (width * 10) + " but actual area: " + rectangle.getArea());
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 4);
		LspDemo.useIt(rectangle);
		
		Rectangle square = new Square(6);
		LspDemo.useIt(square);
	}
}
