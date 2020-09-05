package a.solid.design.patterns.ocp;

/*
 * All the filter types like gpa, grade level etc.
 */
public interface Specification<T> {
	// check if any entity like student object satisfies the condition
	boolean isSatisfied(T t);
}
