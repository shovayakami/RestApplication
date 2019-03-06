package np.com.pangait.controller;

import np.com.pangait.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shova Yakami Dangol on 8/30/2018 5:57 PM.
 */
@RestController
@RequestMapping("/rest")
public class CustomerController {

    @RequestMapping(value="/getCustomer",method= RequestMethod.GET,produces="application/json")
    public Customer getCustomer() {
        Customer cust = new Customer();
        cust.setName("Som");
        cust.setId(1540);
        cust.setAddress("Parasi");
        return  cust;
    }
    @RequestMapping(value="/getPersons",method= RequestMethod.GET,produces="application/json")
    public List<PersonDto> getPersons(){
        List<Person> personList = RestApplication.personList;
        List<PersonDto> personDtoList = createPersonDtoList(personList);

        return personDtoList;
    }

    private List<PersonDto> createPersonDtoList(List<Person> personListInput) {
        List<PersonDto> rPersonDtoList = new ArrayList<>();

        for (Person person: personListInput) {

            PersonDto personDto = new PersonDto();
            NameDto nameDto = new NameDto();

            nameDto.setFirstName(person.getFirstName());
            nameDto.setLastName(person.getLastName());

            personDto.setName(nameDto);

            personDto.setAge(person.getAge());

            AddressDto addressDto = new AddressDto();
            addressDto.setCity(person.getCity());
            addressDto.setState(person.getState());
            addressDto.setCountry(person.getCountry());

            personDto.setAddress(addressDto);
            personDto.setHealthy(person.isHealthy());

            rPersonDtoList.add(personDto);
        }
        return rPersonDtoList;
    }
    @RequestMapping(value ="/addPerson",method = RequestMethod.GET,produces = "application/json")
    public Person addPerson(
            @RequestParam(value = "fName")String firstName,
            @RequestParam(value = "lName")String lastName,
            @RequestParam(value = "age")int age,
            @RequestParam(value = "City")String city,
            @RequestParam(value = "State")String state,
            @RequestParam(value = "Country")String country,
            @RequestParam(value = "IsHealthy")boolean isHealthy
            ){
        Person abc = new Person(firstName,lastName,age,city,state,country,isHealthy);
        RestApplication.personList.add(abc);
        return abc;


    }
    @RequestMapping(value="/getHealthyPersons",method= RequestMethod.GET,produces = "application/json")
    public List<PersonDto> getHealthyPersons(){
        List<Person> healthyPersons = new ArrayList<>();
        for(Person person: RestApplication.personList) {
            if (person.isHealthy()) {
                healthyPersons.add(person);
            }
        }
        return createPersonDtoList(healthyPersons);
    }
    @RequestMapping(value="/getPersonsWith",method= RequestMethod.GET,produces = "application/json")
    public List<PersonDto> getPersonsWith(@RequestParam(value="ageGreaterThan", defaultValue="29") int age) {
        List<Person> personsWith = new ArrayList<>();
        for (Person person: RestApplication.personList) {
            if (person.getAge()>=age) {
                personsWith.add(person);
            }
        }
        return createPersonDtoList(personsWith);
    }
    @RequestMapping(value = "/getPersonsWithHealth", method = RequestMethod.GET,produces = "application/json")
    public List<Person> getPersonsWithHealth(@RequestParam(value="healthy", defaultValue="true") boolean healthy){
    List<Person> personsWithHealth = new ArrayList<>();

    for(Person person: RestApplication.personList){
        if (person.isHealthy()==healthy){
            personsWithHealth.add(person);
        }
    }
    return personsWithHealth;
    }
    @RequestMapping(value = "/getPersonsAgeGreaterThanAndHealth", method = RequestMethod.GET,produces = "application/json")
    public List<Person> getPersonsAgeGreaterThanAndHealth(@RequestParam(value="healthy", defaultValue="true") boolean healthy,
                                                          @RequestParam(value="age", defaultValue="30") int age){
        List<Person> personsAgeGreatThanAndHealth = new ArrayList<>();

        for(Person person: RestApplication.personList){
            if (person.getAge()>= age && person.isHealthy()== healthy){
                personsAgeGreatThanAndHealth.add(person);
            }
        }
        return personsAgeGreatThanAndHealth;
    }
    @RequestMapping(value = "/getPersonsCityAndCountry", method = RequestMethod.GET,produces = "application/json")
    public List<Person> getPersonsCityAndCountry(@RequestParam(value="city", defaultValue="bb") String city,
                                                          @RequestParam(value="country", defaultValue="USA") String country){
        List<Person> personsCityAndCountry = new ArrayList<>();

        for(Person person: RestApplication.personList){
            if (person.getCity().equalsIgnoreCase(city) && person.getCountry().equalsIgnoreCase(country)){
                personsCityAndCountry.add(person);
            }
        }
        return personsCityAndCountry;
    }

    @RequestMapping(value = "/addPersonPOST", method = RequestMethod.POST,produces = "application/json")
    public List<Person> addPersonPOST(@RequestBody Person p){

        RestApplication.personList.add(p);

        return RestApplication.personList;
    }
}
