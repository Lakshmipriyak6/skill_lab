package MinandMaxValueofArrays;

class ArrayMinMax<T extends Comparable<T>> implements MinMax<T> {
    private T[] array;

    public ArrayMinMax(T[] array) {
        this.array = array;
    }
    public T min() {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T max() {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}