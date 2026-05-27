package com.java.streamsTerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningByOperationDemo {

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

        Map<Boolean, List<Product>> partitoningByPriceMap = productList.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice()>1000));

        System.out.println(partitoningByPriceMap);

    }
}
