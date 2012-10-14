package com.home.javabegin;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/13/12
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends Person {

    private String position = null;
    private String depart = null;

    /**
     *
     * @param name
     * @param age
     * @param position
     * @param depart
     */
    public Employee(String name, int age, String position, String depart) {
        super(name, age);
        this.position  = position;
        this.depart = depart;

    }

    public Employee() {
        //super();
    }
    /**
     *
     * @param name
     * @param age
     * @param dateOfBirth
     * @param country
     * @param city
     * @param street
     * @param streetNo
     * @param position
     * @param depart
     */
    public Employee(String name, int age,
                    Date dateOfBirth,
                    String country,
                    String city,
                    String street,
                    int streetNo,
                    String position,
                    String depart) {
        super(name, age, dateOfBirth, country, city, street, streetNo);
        this.position  = position;
        this.depart = depart;
    }

    public String getEmployee(){
        return (getName()+ " | " + getAge() + " | " + position + " | " + depart);
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
