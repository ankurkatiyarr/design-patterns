package a.solid.design.patterns.ocp;

import java.util.List;
import java.util.stream.Collectors;

import student.database.Student;

public class FilterImpl implements Filter<Student> {
	@Override
	public void filter(List<Student> list, Specification<Student> specification) {
		List<Student> result = list.stream().filter(student -> specification.isSatisfied(student)).collect(Collectors.toList());
		System.out.println("result: " + result);
	}
}
