package b.creational.e.prototype;

/**
 * 
 * Prototype class
 *
 */
public abstract class GameUnit implements Cloneable {
	private Position position = new Position();

	public void move(float x, float y, float z) {
		position.setX(position.getX() + x);
		position.setY(position.getY() + y);
		position.setZ(position.getZ() + z);
	}
	
	protected void initializeGameUnit() {
		position.setX(0);
		position.setY(0);
		position.setZ(0);
		reset();
	}
	
	public abstract void reset();
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit) super.clone();
		unit.initializeGameUnit();
		return unit;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "GameUnit [position=" + position + "]";
	}
}
