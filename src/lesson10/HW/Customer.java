package lesson10.HW;

public class Customer {
    String name;
    String city;
    String gender;

    public Customer(String name, String city, String gender) {
        this.name = name;
        this.city = city;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }
}
