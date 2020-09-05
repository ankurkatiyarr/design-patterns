package a.solid.design.patterns.ocp;

import student.database.Student;

public class GpaSpecification implements Specification<Student> {
	private double gpa;

	public GpaSpecification(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public boolean isSatisfied(Student student) {
		return student.getGpa() == gpa;
	}
}
