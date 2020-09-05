package a.solid.design.patterns.ocp;

import student.database.Student;

public class GradeLevelSpecification implements Specification<Student> {
	private int gradeLevel;

	public GradeLevelSpecification(int gradeLevel) {
		super();
		this.gradeLevel = gradeLevel;
	}

	@Override
	public boolean isSatisfied(Student student) {
		return student.getGradeLevel() == gradeLevel;
	}
}
