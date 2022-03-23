package lesson17.ClassWorkRepetition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        Person[] people = {
                new Person("Max", 15),
                new Person("Max", 15),
                new Person("Dima", 14),
                new Person("Max", 15),
                new Person("Max", 15),
                new Person("Dima", 14),
                new Person("Max", 15),
                new Person("Max", 15),
                new Person()};
        System.out.println(Arrays.toString(people));

        boolean[] isAccounted = new boolean[people.length];
        int equalityCounter = 0;
        for (int i = 0; i < people.length; i++) {
            if (isAccounted[i]) {
                continue;
            }
            for (int j = i + 1; j < people.length; j++) {
                if (isAccounted[i]) {
                    continue;
                }
                if (people[i].equals(people[j])) {
                    equalityCounter++;
                    isAccounted[j] = true;
                }
            }
        }
        System.out.println(equalityCounter);
    }
}
