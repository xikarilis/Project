package lesson17.ClassWorkRepetition;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        name = "Max";
        age = 23;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("name = " + name + " age = " + age);
    }

    @Override
    public String toString(){
        return "Person:"+ name + '\t' + "age:" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
