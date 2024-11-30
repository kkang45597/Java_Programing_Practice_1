package equals;

public class Main {
    public static void main(String[] args) {
        // Person 객체 생성
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Jane", 30);

        // hashCode 메서드 사용 예제
        System.out.println("HashCode of person1: " + person1.hashCode());
        System.out.println("HashCode of person2: " + person2.hashCode());
        System.out.println("HashCode of person3: " + person3.hashCode());

        // equals 메서드 사용 예제
        System.out.println("person1 equals person2: " + person1.equals(person2)); // true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // false

        // Person 객체를 HashSet에 저장하여 중복 제거 예제
        java.util.HashSet<Person> personSet = new java.util.HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("Number of unique persons: " + personSet.size()); // 2 (person1과 person2는 동일한 객체로 간주)
    }
}

class Person implements Cloneable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // hashset(엘리먼트의 값 중복을 허용하지 않는) 같은 collection에 엘리먼트로 사용될 경우, hashCode와 equals 메서드가 사용된다.
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
}
