package com.home.javabegin;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/13/12
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends Person 
implements CompareEmployee<Employee>,Comparable<Employee>		
	{

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

	@Override
	public void compareName(Employee other) {
		// TODO Auto-generated method stub
		if(getName().equals(other.getName())) {
			System.out.println("First name: " + getName() + " is the same as second name: " + other.getName());
		}
		if(!getName().equals(other.getName())) {
			System.out.println("First name: " + getName() + " is NOT the same as second name: " + other.getName());
		}
	}

	@Override
	public int compareTo(Employee o) {
		final int OLDER = -1;
		final int YOUNGER = 1;
		final int EQUAL = 0;
		
		if(this.getAge()>o.getAge()) return OLDER;
		if(this.getAge()<o.getAge()) return YOUNGER;
		if(this.getAge()==o.getAge()) return EQUAL;
		return EQUAL;
	}


}
