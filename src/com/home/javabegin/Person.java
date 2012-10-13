/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/11/12
 * Time: 6:19 PM
 * To change this template use File | Settings | File Templates.
 */

package com.home.javabegin;
import java.util.Date;


public class Person extends Address {

    private String name = null;
    private int age = 0;
    private Date dateOfBirth;

    /**
     *
     * @param name
     * @param age
     * @param dateOfBirth
     * @param country
     * @param city
     */
    // The constructor method
    public Person(String name, int age, Date dateOfBirth, String country,String city, String street, int streetNo ) {

        super(country, city, street,streetNo);
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
     }

    /**
     * @param name
     * @param age
     */
    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public Person() {

    }
    public void displayPersonDetails() {

        System.out.println("Name: " + name);
        System.out.println("Address: " + getAddress() );
        System.out.println("Age: " + age);
        System.out.println("Date of birth: " + dateOfBirth);
    }

    public void sayPerson(String saySomething) {
        System.out.println(name + " is saying: " + saySomething.toUpperCase());

    }

    public void sayPerson(String saySomething, String saySomethingNew) {
        System.out.println(name + " is saying: " + saySomething.toUpperCase() + " " + saySomethingNew.toUpperCase());

    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            System.out.println(("warning: name cannot be NULL and " +
                    "must be longer than 2 chars").toUpperCase());
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return override Address class method getAddress()
     */
    /*
    public String getAddress(){
        String address = getCountry().toString() + " override";
        return address;
    }
    */


}
