package clone1;

public class Person implements Cloneable {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); // 깊은 복제를 위해 Address 객체도 복제
        return cloned;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}
