package lessons.lesson2.demo_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Magazine magazine = new Magazine();

        ArrayList<Printable> printable = new ArrayList<>();
        printable.add(magazine);
        printable.add(book);


    }
}



//       а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
//