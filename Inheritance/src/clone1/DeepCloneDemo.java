package clone1;

public class DeepCloneDemo {
	
	public static void main(String[] args) {
        try {
            Address address = new Address("New York", "5th Avenue");
            Person original = new Person("John", 30, address);
            Person clone = (Person) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Clone: " + clone);

            // 원본 객체의 Address를 수정
            original.address.city = "Los Angeles";

            System.out.println("After modifying original's address:");
            System.out.println("Original: " + original);
            System.out.println("Clone: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
