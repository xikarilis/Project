package lesson24;

import lesson22.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone huawei = new Phone("+375255386370", 1.2, "P20");
        Phone apple = new Phone("+37525538340", 1.0, "S5");
        Phone samsung = new Phone("+375255345678", 1.5, "galaxy");

//        System.out.println(huawei.receiveCall(apple));
//        System.out.println(apple.sendMessage(samsung));

        Reader reader1 = new Reader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        reader1.setName(scanner.nextLine());
        System.out.println("Введите фамилию");
        reader1.setLastName(scanner.nextLine());
        System.out.println("Введите возраст");
        reader1.setAge(scanner.nextInt());
        System.out.println("Введите адресс");
        reader1.setAddress(scanner.next());

        ArrayList<Map<Book, Reader>> arrayList = new ArrayList<>();
        Book book1 = new Book("Война и мир", "Толстой");
        Book book2 = new Book("Муму", "Тургеньев");
        Book book3 = new Book("Преступление и наказание", "Достоевский");

        ArrayList<Book> list1 = new ArrayList<>();
        list1.add(book1);
        list1.add(book2);
        list1.add(book3);

        Library library = new Library();
        while (true) {
            System.out.println("введите 1, если хотите получить книгу");
            System.out.println("Введите 2, если хотите вернуть книгу");
            System.out.println("Введите 0, если хотите выйти из программы");


            int operation = scanner.nextInt();

            switch (operation) {
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Доступные книги: ");
                    System.out.println(list1);
                    int bookNumber = scanner.nextInt();
                    arrayList.add(library.takeBook(list1.get(bookNumber + 1), reader1));
                    list1.remove(bookNumber + 1);
                case 2:
                    System.out.println("книги записанные на вас. Введите номер книги. которую хотите вернуть: ");
                    System.out.println(arrayList);
                    int bookNum = scanner.nextInt();
                    Map<Book,Reader> map = new HashMap<>();
                    Book book = (Book) arrayList.get(bookNum+1).keySet();
                    Reader reader = arrayList.get(bookNum+1).get(book);
//                    arrayList = library.returnBook(book, reader);
                    System.out.println();
            }
        }

    }
}
