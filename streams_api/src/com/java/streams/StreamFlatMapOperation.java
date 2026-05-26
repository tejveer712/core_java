package com.java.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapOperation {

    public static void main(String[] args) {

        String[] arrayOfLang = {"Hindi", "English", "French", "Hebrew"};

        Stream<String> streamOfLang = Arrays.stream(arrayOfLang);
        //System.out.println("Printing just array to lang");
        //streamOfLang.forEach(System.out::println);
        Stream<String []> streamOfLangs =streamOfLang.map(lang -> lang.split(""));
        streamOfLangs.flatMap(Arrays::stream).forEach(System.out::println);




    }
}
