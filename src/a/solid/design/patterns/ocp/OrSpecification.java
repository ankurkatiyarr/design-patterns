package a.solid.design.patterns.ocp;

import java.util.List;

public class OrSpecification<T> implements Specification<T> {
	private List<Specification<T>> listOfSpecification;

	public OrSpecification(List<Specification<T>> listOfSpecification) {
		this.listOfSpecification = listOfSpecification;
	}

	@Override
	public boolean isSatisfied(T t) {
		boolean flag = false;
		for (Specification<T> specification : listOfSpecification) {
			flag = flag || specification.isSatisfied(t);
		}
		return flag;
	}
}
