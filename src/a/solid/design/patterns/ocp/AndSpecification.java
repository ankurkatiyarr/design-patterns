package a.solid.design.patterns.ocp;

import java.util.List;

public class AndSpecification<T> implements Specification<T> {
	private List<Specification<T>> listOfSpecifications;
	
	public AndSpecification(List<Specification<T>> listOfSpecifications) {
		this.listOfSpecifications = listOfSpecifications;
	}

	@Override
	public boolean isSatisfied(T t) {
		boolean flag = true;
		for (Specification<T> specification : listOfSpecifications) {
			flag = flag && specification.isSatisfied(t);
		}
		
		return flag;
	}

}
