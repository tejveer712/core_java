package com.java.streamsIntermediateOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapOperationDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Engineering");

        departmentList.stream()                                //Creating Stream
                .map(word -> word.toUpperCase())         // Intermediate operation
                .forEach(System.out::println);                 // Terminal operation

        departmentList.stream()
                .map(word -> word.toUpperCase())
                .map(word ->"Hi "+word)
                .forEach(System.out::println);

        List<Person> persons = Arrays.asList(new Person ("Alice", Arrays.asList("123", "678"))
                                , new Person ("Bob", Arrays.asList("123", "456")));

        List<List<String>> mapResult = persons.stream().map(Person::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(mapResult);

        List<String> flatMapResult = persons.stream().flatMap(person -> person.getPhoneNumbers()
                .stream()).collect(Collectors.toList());
        System.out.println(flatMapResult);
    }

}
