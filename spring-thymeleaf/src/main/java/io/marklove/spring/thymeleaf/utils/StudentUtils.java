package io.marklove.spring.thymeleaf.utils;

import io.marklove.spring.thymeleaf.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {

    private static List<Student> students = new ArrayList<>();

    public static List<Student> buildStudents() {
        if (students.isEmpty()) {
            Student student1 = new Student();
            student1.setId(1001);
            student1.setName("Beren");
            student1.setGender('M');
            student1.setPercentage(Float.valueOf("80.45"));

            students.add(student1);

            Student student2 = new Student();
            student2.setId(1002);
            student2.setName("Luthien");
            student2.setGender('F');
            student2.setPercentage(Float.valueOf("60.25"));

            students.add(student2);
        }

        return students;
    }

}
