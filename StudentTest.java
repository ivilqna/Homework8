package fmi.informatics.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import fmi.informatics.extending.Student;

public class StudentTest {
	List<Student> Student = Arrays.asList(new Student(), new Student());

	public String sort(String one, String two) {
		Student.get(0).setName("David");
		Student.get(1).setName("Lyis");

		Student.sort((a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		return Student.get(0).getName() + Student.get(1).getName();
	}

	@Test
	public void Stest() {
		String result = sort(Student.get(0).getName(), Student.get(1).getName());
		String expectedResult = Student.get(0).getName() + Student.get(1).getName();

		assertEquals(expectedResult, result);
	}


	@Test
	public void testSortingFailed() {
		fail("The test failed!");
	}
}
