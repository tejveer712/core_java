package com.java.method.reference;

public class ConstructorReferenceDemo {

    public static void main(String[] args) {
        ProductInterface productInterface = (name, price) -> new Product(name, price);
        System.out.println(productInterface.getProduct("Dell XPS", 1200000));

        ProductInterface constructorReference = Product::new;
        System.out.println(constructorReference.getProduct("Dell Alienware", 4200000));
    }
}
