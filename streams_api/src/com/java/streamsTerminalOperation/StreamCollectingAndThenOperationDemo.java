package com.java.streamsTerminalOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectingAndThenOperationDemo {

    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product("Apple", 1200),
                new Product("Samsung", 1000),
                new Product("Nokia", 800),
                new Product("BlackBerry", 1000),
                new Product("Redmi", 600),
                new Product("Realme", 700),
                new Product("OnePlus", 900),
                new Product("Oppo", 500),
                new Product("Vivo", 1050));

        String maxPriceProduct = productList.stream().collect(Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                (productOptional -> productOptional.isPresent() ?
                        productOptional.get().getName() : "None")
        ));

        System.out.println(maxPriceProduct);
    }
}
