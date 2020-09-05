package a.solid.design.patterns.ocp;

import java.util.Arrays;
import java.util.List;

import student.database.Student;
import student.database.StudentDataBase;

public class OcpDemo {
	public static void main(String[] args) {
		FilterImpl filterImpl = new FilterImpl();

//		// Single filters
//		System.out.println("Students having gpa as 4:");
//		filterImpl.filter(StudentDataBase.getAllStudents(), new GpaSpecification(4.0));
//		System.out.println("Students having grade level as 3:");
//		filterImpl.filter(StudentDataBase.getAllStudents(), new GradeLevelSpecification(3));
		
//		// and filter
//		List<Specification<Student>> listOfSpecifications = Arrays.asList(new GpaSpecification(3.5), new GradeLevelSpecification(4));
//		AndSpecification<Student> andSpecification = new AndSpecification<>(listOfSpecifications);
//		filterImpl.filter(StudentDataBase.getAllStudents(), andSpecification);
		
		// or filter
		List<Specification<Student>> listOfSpecification = Arrays.asList(new GpaSpecification(4.0), new GradeLevelSpecification(4));
		OrSpecification<Student> orSpecification = new OrSpecification<Student>(listOfSpecification);
		filterImpl.filter(StudentDataBase.getAllStudents(), orSpecification);
	}
}
