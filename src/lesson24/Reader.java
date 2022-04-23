package lesson24;

import java.util.Scanner;

public class Reader {
    private String name;
    private String LastName;
    private int age;
    private String address;

    public Reader() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
