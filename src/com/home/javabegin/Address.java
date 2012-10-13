/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/12/12
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */

package com.home.javabegin;

public class Address {

        private String country = null;
        private String city = null;
        private String street = null;
        private int streetNo = 0;


        // The constructor method

    /**
     *
     * @param country
     * @param city
     * @param street
     * @param streetNo
     */
       public  Address(String country, String city, String street, int streetNo) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.streetNo = streetNo;

        }

        // The constructor method
        public Address(String country, String city) {
            this.country = country;
            this.city = city;
            //this.street = street;
            //this.streetNo = streetNo;

        }

        // The constructor method
        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
            //this.streetNo = streetNo;

    }

    /**
     *
     */
    // The constructor method
    public Address() {
        this.country = "BG";
        this.city = "Sofia";
        this.street = "Central";
        this.streetNo = 1000;
    }


    /**
     *
     * @return  in format: country + "," + city + "," + street + "," + streetNo;
     */
    public String getAddress(){
        String address = country + "," + city + "," + street + "," + streetNo;
        return address;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }
}
