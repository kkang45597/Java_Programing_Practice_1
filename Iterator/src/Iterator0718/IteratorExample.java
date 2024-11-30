package Iterator0718;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("banana")) {
                iterator.remove(); // "banana" 요소를 제거
            }
        }

        for (String fruit : list) {
            System.out.println(fruit); // "apple"과 "orange"만 출력
        }
    }
}