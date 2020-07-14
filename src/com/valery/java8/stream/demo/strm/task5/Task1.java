package com.valery.java8.stream.demo.strm.task5;

import com.valery.test.strm.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(18, "Ivan", "Ivanov"),
                new Student(25, "Брюс", "Ли"),
                new Student(30, "Petr", "Petrov"),
                new Student(50, "Sidor", "Sidorov"),
                new Student(40, "Sidor", "Sidorovsidorov")
        );

        students.stream()
                .filter(person -> person.fullName().length() < 15)
                .max(Comparator.comparing(Student::getAge))
                .ifPresent(System.out::println);
    }
}
