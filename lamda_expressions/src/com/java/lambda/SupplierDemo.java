package com.java.lambda;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> getCurrentMonth = () ->  LocalDate.now().getMonthValue();
        System.out.println(getCurrentMonth.get());


        Supplier<Integer> getCurrentDayOfMonth = () ->  LocalDate.now().getDayOfMonth();
        System.out.println(getCurrentDayOfMonth.get());

    }
}
