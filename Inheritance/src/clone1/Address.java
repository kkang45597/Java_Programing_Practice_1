package clone1;

public class Address implements Cloneable {
	String city;
    String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', street='" + street + "'}";
    }
}
