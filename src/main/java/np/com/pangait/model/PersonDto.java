package np.com.pangait.model;

/**
 * Created by bikra on 3/2/2019 5:47 PM.
 */
public class PersonDto {
    private NameDto name;
    private int age;
    private AddressDto address;
    private boolean isHealthy;

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public NameDto getName() {
        return name;
    }

    public void setName(NameDto name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
