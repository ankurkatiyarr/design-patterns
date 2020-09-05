package b.creational.e.prototype;

public class Position {
	private float x;
	private float y;
	private float z;

	public Position() {
		super();
	}

	public Position(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
