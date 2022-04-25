package Homework.Ninth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUniversity {

    public static void main(String[] args) {

      List<Student> students = new ArrayList<>();

      students.add(new Student("Ivan", Arrays.asList(new Course("Chemistry"), new Course("Physics"),
              new Course("Geometry"), new Course("Biology"), new Course("Math"))));

        students.add(new Student("Sergey", Arrays.asList(new Course("Chemistry"), new Course("Geography"),
                new Course("Biology"), new Course("Philosophy"))));

        students.add(new Student("Nikolay", Arrays.asList(new Course("Physics"), new Course("Biology"),
                new Course("Geography"), new Course("Literature"))));

        students.add(new Student("Vladimir", Arrays.asList(new Course("Physics"), new Course("Biology"),
                new Course("Chemistry"), new Course("Geometry"), new Course("Astronomy"))));

        students.add(new Student("Olga", Arrays.asList(new Course("Math"), new Course("Physics"),
                new Course("Literature"), new Course("Art"))));

        students.add(new Student("Evgeniya", Arrays.asList(new Course("Chemistry"), new Course("Biology"),
                new Course("Geometry"), new Course("Math"), new Course("Physics"), new Course("Art"))));

        students.add(new Student("Ekaterina", Arrays.asList(new Course("Math"), new Course("Astronomy"),
                new Course("Art"), new Course("Literature"))));

        System.out.print("List of course : \n");
        // fist tack
        students.stream()
                .flatMap(f -> f.getStudentList().stream())
                .distinct()
                .forEach(System.out::println);

        // second tack
        System.out.print("\nThe most inquisitive students:\n");
        students.stream()
                .sorted((stud1, stud2) -> stud2.getStudentList().size() - stud1.getStudentList().size())
                .limit(3)
                .collect(Collectors.toList());



        //third tack
        System.out.print("\nStudents attends a math course:\n");
        Course course = new Course("Chemistry");
        students.stream()
                .filter(s -> s.getStudentList().contains(course))
                .collect(Collectors.toList());

    }


}
