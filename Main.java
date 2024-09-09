package com.BinarySearchAlgorithm;

public class Main
{
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "orange", "pear"};
        Double[] doubleArray = {1.2, 3.4, 5.6, 7.8};

        BinarySearch<Integer> intSearch = new BinarySearch<>();
        BinarySearch<String> strSearch = new BinarySearch<>();
        BinarySearch<Double> doubleSearch = new BinarySearch<>();

        System.out.println("Index of 3 in intArray: " + intSearch.binarySearch(intArray, 3));
        System.out.println("Index of 'orange' in strArray: " + strSearch.binarySearch(strArray, "orange"));
        System.out.println("Index of 5.6 in doubleArray: " + doubleSearch.binarySearch(doubleArray, 5.6));
    }
}
