package com.java.streamsIntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Engineering");

        // Normal Stream
        Stream<String> deptStream = departmentList.stream();
        deptStream.forEach(System.out::println);

        Stream<String> inputStream =Stream.of("Java", "C++", "Python");
        inputStream.forEach(System.out::println);

        // Elements are processed parallely, they are executed in order
        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);

        Stream<String> emptyString = Stream.empty();

        //To generate a infinite stream

        //This will print random integers
        Stream.generate(new Random()::nextInt).forEach( System.out::println);

        // This will print random integer value and the next value will be n+1
        Stream.iterate(1,n -> n+1).forEach(System.out::println);
    }
}
