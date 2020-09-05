package b.creational.e.prototype;

public class MajorGeneral extends GameUnit {
	private String state = "idle";
	
	public void boostMorale() {
		this.state = "Boosting morale..";
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException("Reset not supported");
	}
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("MajorGenerals are unique");
	}
	
	@Override
	public String toString() {
		return "General [state=" + state + "] and position: " + getPosition();
	}
}
