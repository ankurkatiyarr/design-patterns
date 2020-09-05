package a.solid.design.patterns.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//low-level module because it has one list and is not having any business logic
public class DRelationships implements CRelationshipBrowser {
	private List<FPersonRelationshipTuple> relations = new ArrayList<FPersonRelationshipTuple>();

	public List<FPersonRelationshipTuple> getRelations() {
		return relations;
	}

	public void addParentAndChild(BPerson parent, BPerson child) {
		relations.add(new FPersonRelationshipTuple(parent, ARelationship.PARENT, child));
		relations.add(new FPersonRelationshipTuple(child, ARelationship.CHILD, parent));
	}

	@Override
	public List<BPerson> findAllChildrenOf(String name) {
		List<BPerson> list = relations.stream()
		.filter(personRelationshipTuple -> personRelationshipTuple.getPerson1().name.equalsIgnoreCase("John") &&
				personRelationshipTuple.getRelationship() == ARelationship.PARENT)
		.map(personRelationshipTuple -> personRelationshipTuple.getPerson2()).collect(Collectors.toList());
		return list;
	}
}
