package a.solid.design.patterns.dip;

import java.util.List;

public interface CRelationshipBrowser {
	List<BPerson> findAllChildrenOf(String name);
}
