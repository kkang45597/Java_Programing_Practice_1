package Generics0717;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void process(List<? extends Foo> list) {
        for (Foo elem : list) {
            System.out.println("Processing: " + elem.getName());
        }
    }

    public static void main(String[] args) {
        List<Bar> barList = new ArrayList<>();
        barList.add(new Bar("Bar1"));
        barList.add(new Bar("Bar2"));
        barList.add(new Bar("Bar3"));
        
        List<FooBar> barList2 = new ArrayList<>();
        barList2.add(new FooBar("Bar4"));
        barList2.add(new FooBar("Bar5"));
        barList2.add(new FooBar("Bar6"));

        process(barList); // Using the process method with a List of Bar
        process(barList2);
    }
}
