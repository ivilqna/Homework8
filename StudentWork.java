package fmi.informatics.extending;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentWork {

	public static void main(String[] args) {
		StudentsWork();
	}

	public static void StudentsWork() {
		Scanner scanner = new Scanner(System.in);
		List<Student> Students = Arrays.asList(Student.StudentGenerator.make(), Student.StudentGenerator.make(),
				Student.StudentGenerator.make(), Student.StudentGenerator.make(), Student.StudentGenerator.make());
		
		Students.forEach((s) -> System.out.println("Name: " + s.getName() + ", University: " + s.getUniversity()
				+ ", Speciality: " + s.getSpeciality() + ", Fac.Num.: " + s.getFacNumber() + ", Age: " + s.getAge()));

		System.out.println("\nИзбери 1 за низходящо или 2 за възходящо сортиране ");
		try {
			int input = scanner.nextInt();
			if (input == 1) {
				System.out.println("\n\nСортира по специалност(НИЗХОДЯЩ)");
				sortStudentsDes(Students);
				Students.forEach((s) -> System.out
						.println("Name: " + s.getName() + ", University: " + s.getUniversity() + ", Speciality: "
								+ s.getSpeciality() + ", Fac.Num.: " + s.getFacNumber() + ", Age: " + s.getAge()));
				sortStudentsAsc(Students);
				Students.forEach((s) -> System.out
						.println("Name: " + s.getName() + ", University: " + s.getUniversity() + ", Speciality: "
								+ s.getSpeciality() + ", Fac.Num.: " + s.getFacNumber() + ", Age: " + s.getAge()));

			} else if (input == 2) {
				System.out.println("\n\nСортира по специалност(ВЪЗХОДЯЩ)");
				sortStudentsAsc(Students);
				Students.forEach((s) -> System.out
						.println("Name: " + s.getName() + ", University: " + s.getUniversity() + ", Speciality: "
								+ s.getSpeciality() + ", Fac.Num.: " + s.getFacNumber() + ", Age: " + s.getAge()));

			} else {
				System.out.println("По подразбиране");
				Students.forEach((s) -> System.out
						.println("Name: " + s.getName() + ", University: " + s.getUniversity() + ", Speciality: "
								+ s.getSpeciality() + ", Fac.Num.: " + s.getFacNumber() + ", Age: " + s.getAge()));
			}
		} catch (Exception e) {
			System.err.println("Избери число");
		}

		if (!(scanner.hasNext())) {
			scanner.close();
		}
	}

	public static void sortStudentsDes(List<Student> students) {
		students.sort((a, b) -> {
			return b.getSpeciality().compareTo(a.getSpeciality());
		});
	}

	public static void sortStudentsAsc(List<Student> students) {
		students.sort((a, b) -> {
			return a.getSpeciality().compareTo(b.getSpeciality());
		});
	}

}
