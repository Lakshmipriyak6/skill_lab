package com.BinarySearchAlgorithm;

class BinarySearch<T extends Comparable<T>> {
public int binarySearch(T[] array, T key) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (array[mid].compareTo(key) == 0) {
            return mid;
        } else if (array[mid].compareTo(key) < 0) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1; // Key not found
}
}