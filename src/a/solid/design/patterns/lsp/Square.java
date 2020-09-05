package a.solid.design.patterns.lsp;

public class Square extends Rectangle {
	protected double size;

	public Square(double size) {
		super.width = size;
		super.height = size;
	}

	// This violates Liskov substitution principle, check  LspDemo
	@Override
	public void setWidth(double size) {
		super.setWidth(size);
		super.setHeight(size);
	}

	@Override
	public void setHeight(double size) {
		super.setWidth(size);
		super.setHeight(size);
	}
}
