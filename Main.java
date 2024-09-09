package MinandMaxValueofArrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 4, 1, 5};
        String[] strArray = {"apple", "orange", "banana", "pear"};
        Float[] floatArray = {1.2f, 3.4f, 0.6f, 7.8f};
        Character[] charArray = {'a', 'z', 'm', 'f'};

        ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>(intArray);
        ArrayMinMax<String> strMinMax = new ArrayMinMax<>(strArray);
        ArrayMinMax<Float> floatMinMax = new ArrayMinMax<>(floatArray);
        ArrayMinMax<Character> charMinMax = new ArrayMinMax<>(charArray);

        System.out.println("Integer Min: " + intMinMax.min() + ", Max: " + intMinMax.max());
        System.out.println("String Min: " + strMinMax.min() + ", Max: " + strMinMax.max());
        System.out.println("Float Min: " + floatMinMax.min() + ", Max: " + floatMinMax.max());
        System.out.println("Character Min: " + charMinMax.min() + ", Max: " + charMinMax.max());
    }
}
