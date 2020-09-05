package b.creational.e.prototype;

public class Swordsman extends GameUnit {
	private String state = "idle";
	
	public void attack() {
		state = "Swordsman is attacking";
	}

	@Override
	public void reset() {
		this.state = "idle";
	}
	
	@Override
	public String toString() {
		return "Swordsman [state=" + state + "] and position: " + getPosition();
	}
}
