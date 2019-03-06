package np.com.pangait.model;

/**
 * Created by bikra on 3/1/2019 3:31 PM.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private String state;
    private String country;
    private boolean isHealthy;

    public Person(String firstName, String lastName, int age, String city, String state, String country, boolean isHealthy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.state = state;
        this.country = country;
        this.isHealthy = isHealthy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
