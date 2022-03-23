package lesson17.ClassWorkRepetition;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        Person[] personArray = {
                new Person("Max", 15),
                new Person("Max", 15),
                new Person("Dima", 14),
                new Person("Max", 15),
                new Person("Max", 15),
                new Person("Dima", 14),
                new Person("Max", 15),
                new Person("Max", 15)};
        System.out.println(Arrays.toString(personArray));
        int count = 0;
        {
            Set set = new HashSet();
            for (int i = 0; i < personArray.length; i++) {
                if (!set.add(personArray[i])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
