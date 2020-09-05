package a.solid.design.patterns.ocp;

import java.util.List;

public interface Filter<T> {
	/*
	 * list: what to filter
	 * specification: what specific filter to apply
	 */
	void filter(List<T> list, Specification<T> specification);
}
