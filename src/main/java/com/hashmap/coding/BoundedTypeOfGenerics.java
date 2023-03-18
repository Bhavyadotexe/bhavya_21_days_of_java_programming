package com.hashmap.coding;

public class BoundedTypeOfGenerics {
    public static void main(String[] args) {
        Integer integerArray[] = {12, 2, 34, 23, 32};
        PrintSum<Integer> psInteger = new PrintSum<Integer>();
        psInteger.print(integerArray);

        Double doubleArray[] = {34.8, 56.8, 67.6, 78.4, 65.4};
        PrintSum<Double> psDouble = new PrintSum<Double>();
        psDouble.print(doubleArray);
    }
}

class PrintSum<T extends Number> {
    public void print(T[] arr) {
        double sum = 0;
        for (T value : arr) {
            sum = sum + value.doubleValue();
        }
        System.out.println("Sum = " + sum);
    }
}

