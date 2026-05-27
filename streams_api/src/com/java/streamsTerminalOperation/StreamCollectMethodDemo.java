package com.java.streamsTerminalOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectMethodDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        departmentList.add("Engineering");

        List<String> newDepartmentList = departmentList.stream()
                .filter(word -> word.startsWith("E"))
                .collect(Collectors.toList());

        newDepartmentList.forEach(System.out::println);

        Long totalCount = departmentList.stream()
                .filter(word -> word.startsWith("E"))
                .collect(Collectors.counting());
        System.out.println(totalCount);

        TreeSet<String> newDepartmentList1 = departmentList.stream()
                .filter(word -> word.startsWith("E"))
                .collect(Collectors.toCollection(TreeSet::new));
        newDepartmentList1.forEach(System.out::println);



    }
}
