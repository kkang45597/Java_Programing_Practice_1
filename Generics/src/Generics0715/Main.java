package Generics0715;

public class Main {

	public static void main(String[] args) {
        // Integer 배열 사용 예제
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer intElem = 3;
        int intCount = countGreaterThan(intArray, intElem);
        System.out.println("Number of elements greater than " + intElem + ": " + intCount);
        
        // String 배열 사용 예제
        String[] strArray = {"apple", "banana", "cherry", "date"};
        String strElem = "banana";
        int strCount = countGreaterThan(strArray, strElem);
        System.out.println("Number of elements greater than \"" + strElem + "\": " + strCount);
        
        // Double 배열 사용 예제
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Double doubleElem = 3.3;
        int doubleCount = countGreaterThan(doubleArray, doubleElem);
        System.out.println("Number of elements greater than " + doubleElem + ": " + doubleCount);
    }

    public static <T extends Comparable<T>> int countGreaterThan( T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

}
