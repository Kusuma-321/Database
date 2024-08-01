package com.task.database.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employeedetails")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="EmployeeName",nullable = false)
    private  String name;
    @Column(name="EmployeeAge",nullable = false)
    private int age;
    @Column(name="EmployeeRole",nullable = false)
    private String role;
@Embedded
    private Address address;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }

}
@Embeddable
class Address{
    private  String mobileNumber;
    private  String email;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
    public String getAddress() {
        return String.format("%s, %s, %s, %s, %s, %s, %s",
                mobileNumber, email, street, city, state, country, pincode);
    }
}

