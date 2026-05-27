package com.java.streamsTerminalOperation;

import java.util.List;
import java.util.Optional;

public class StreamFindMatchOperationDemo {

    public static void main(String[] args) {

        List<Item> items = getItems();

        // If all items are in stock or not
        boolean allInStock = items.stream().allMatch(Item::isInStock);
        System.out.println(allInStock);

        // If any item is on sale
        boolean anyOnSale = items.stream().anyMatch(Item::isOnSale);
        System.out.println(anyOnSale);

        // If any item is out of stock
        boolean anyOutOfStock = items.stream().anyMatch(item -> !item.isInStock());
        System.out.println(anyOutOfStock);

        // If any product is costing more than 5000, marking it as overpriced
        boolean isOverPriced = items.stream().noneMatch(item -> item.getPrice()>5000);
        System.out.println(isOverPriced);

        // If price is greater than 1000
        Optional<Item> randomItemOptional = items.stream().filter(item -> item.getPrice()>1000).findAny();
        System.out.println(randomItemOptional);

        // Any price above 1000, return the first item
        Optional<Item> firstItemOptional = items.stream().filter(item -> item.getPrice()>1000).findFirst();
        System.out.println(firstItemOptional);
    }

    private static List<Item> getItems(){
        return List.of(
                new Item("Laptop", 1200, true, false),
                new Item("Phone", 800, true, false),
                new Item("Headphones", 150, false, true),
                new Item("Camera", 2000, true, false),
                new Item("Smartwatch", 300, true, false)
        );
    }
}
