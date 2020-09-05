package a.solid.design.patterns.dip;

public class FPersonRelationshipTuple {
	private BPerson person1;
	private ARelationship relationship;
	private BPerson person2;

	public FPersonRelationshipTuple(BPerson person1, ARelationship relationship, BPerson person2) {
		this.person1 = person1;
		this.relationship = relationship;
		this.person2 = person2;
	}

	public BPerson getPerson1() {
		return person1;
	}

	public void setPerson1(BPerson person1) {
		this.person1 = person1;
	}

	public ARelationship getRelationship() {
		return relationship;
	}

	public void setRelationship(ARelationship relationship) {
		this.relationship = relationship;
	}

	public BPerson getPerson2() {
		return person2;
	}

	public void setPerson2(BPerson person2) {
		this.person2 = person2;
	}

	@Override
	public String toString() {
		return "PersonRelationshipTuple [person1=" + person1 + ", relationship=" + relationship + ", person2=" + person2
				+ "]";
	}

}
