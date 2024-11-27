package level3.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class ListManager {
    public static List<String> getNamesAndAges(List<Student> students) {
        return students.stream()
                .map(student -> student.getName() + " - " + student.getAge())
                .collect(Collectors.toList());
    }

    public static List<String> getStudentsWithNameStartingWith(List<Student> students, String prefix) {
        return students.stream()
                .filter(student -> student.getName().startsWith(prefix))
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStudentsWithGradeGreaterOrEqual(List<Student> students, float grade) {
        return students.stream()
                .filter(student -> student.getGrade() >= grade)
                .map(student -> student.getName() + " - " + student.getGrade())
                .collect(Collectors.toList());
    }

    public static List<String> getStudentsWithGradeAndNotCourse(List<Student> students, float grade, String excludedCourse) {
        return students.stream()
                .filter(student -> student.getGrade() >= grade && !student.getCourse().equalsIgnoreCase(excludedCourse))
                .map(student -> student.getName() + " - " + student.getGrade() + " - " + student.getCourse())
                .collect(Collectors.toList());
    }

    public static List<String> getStudentsInCourseWithAgeGreaterOrEqual(List<Student> students, String course, int age) {
        return students.stream()
                .filter(student -> student.getCourse().equalsIgnoreCase(course) && student.getAge() >= age)
                .map(student -> student.getName() + " - " + student.getAge() + " - " + student.getCourse())
                .collect(Collectors.toList());
    }

    public static void printStudents(String message, List<String> students) {
        System.out.println(message);
        students.forEach(System.out::println);
    }
}
