package a.solid.design.patterns.dip;

//import java.util.List;

public class EResearch { // high-level module because it is having business logic
//	/*
//	 * This violates the Dependency inversion principle which states that any high level module should not be dependent on
//	 * low-level module but here the constructor is dependent on Relationships which is a low-level module
//	 */
//	public EResearch(Relationships relationships) {
//		List<PersonRelationshipTuple> relations = relationships.getRelations();
//		relations.stream()
//		.filter(personRelationshipTuple -> personRelationshipTuple.getPerson1().name.equals("John") 
//				&& personRelationshipTuple.getRelationship() == Relationship.PARENT)
//		.forEach(personRelationshipTuple -> System.out.println("John has a child: " + personRelationshipTuple.getPerson2().name));
//	}
	
	public EResearch(CRelationshipBrowser relationshipBrowser) {
		relationshipBrowser.findAllChildrenOf("John").stream()
		.forEach(person -> System.out.println("John has a child called: " + person.name));
	}
}
