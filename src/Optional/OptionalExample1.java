package Optional;

import java.util.Optional;

public class OptionalExample1 {
	public static Optional<String> getGrade(int marks) {
		Optional<String> grade = Optional.empty();
		if (marks > 50) {
			grade = Optional.of("Pass");
		} else {
			grade.of("FAIL");
		}
		return grade;
	}

	public static void main(String[] args) {
		Optional<String> gradel = getGrade(50);
		Optional<String> grade2 = getGrade(55);
		System.out.println(gradel.orElse("UNKNOWN'"));
		if (grade2.isPresent()) {
			grade2.ifPresent(x -> System.out.println(x));
		} else {
			System.out.println(grade2.orElse("Empty"));
		}
	}
}
