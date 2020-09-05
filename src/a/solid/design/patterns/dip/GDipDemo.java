package a.solid.design.patterns.dip;

public class GDipDemo {
	public static void main(String[] args) {
		BPerson parent = new BPerson("John");
		BPerson child1 = new BPerson("Chris");
		BPerson child2 = new BPerson("Matt");
		
		DRelationships relationships = new DRelationships();
		relationships.addParentAndChild(parent, child1);
		relationships.addParentAndChild(parent, child2);
		
		new EResearch(relationships);
	}
}
