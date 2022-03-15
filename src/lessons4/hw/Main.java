package lessons4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

//            Створити колекцію Юзерів
////        - відсортувати  за  віком (зростання , а потім окремо спадання)
////        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//        List<user> users = new ArrayList<>();
//        users.add(new user(3, "artem"));
//        users.add(new user(4, "andriy"));
//        users.add(new user(1, "orest"));
//        users.add(new user(2, "bogdan"));
//        users.add(new user(5, "Stepan"));
//        users.add(new user(6, "ira"));
//        users.add(new user(9, "kfkfkfkfkfkfkf"));
//
//        List<user> filter = users.stream()
//                .sorted((o1, o2) -> o1.getId() - o2.getId())
//                .collect(Collectors.toList());
//
//        List<user> filter2 = users.stream()
//                .sorted((o1, o2) -> o2.getId() - o1.getId())
//                .collect(Collectors.toList());
//
//        List<user> filter3 = users.stream()
//                .sorted((o1, o2) -> o1.getName().length() - o2.getName().length())
//                .collect(Collectors.toList());
//        List<user> filter4 = users.stream()
//                .sorted((o1, o2) -> o2.getName().length() - o1.getName().length())
//                .collect(Collectors.toList());
//
//        System.out.println(filter);
//        System.out.println(filter2);
//        System.out.println(filter3);
//        System.out.println(filter4);


        //     створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .
//        -- відфільтрувати слова довжиною менше 4 символів
//
//        ArrayList<String> words = new ArrayList<>();
//        words.add(new String("asddffgj"));
//        words.add(new String("basfgfj"));
//        words.add(new String("casfrtuhjl"));
//        words.add(new String("qwrasrj"));
//        words.add(new String("qaffjh"));
//        words.add(new String("qaf"));
//        words.add(new String("q"));
//
////        List<String> sort = words.stream()
////                .sorted((o1, o2) -> o1.compareTo(o2))
////                .collect(toList());
////        System.out.println(sort);
//
//        List<String> lessFour = words.stream()
//                .filter(word -> word.length()<4 )
//                .collect(toList());
//        System.out.println(lessFour);




        //        - Створити масив з 20 числами.
//        - за допомогою способу sorted відсортувати масив.
//        -- за допомогою filter отримати числа кратні 3
//        -- за допомогою filter отримати числа кратні 10
//        -- перебрати (проітерувати) масив за допомогою foreach()
//        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші


        ArrayList<Integer> number = new ArrayList<>();
        number.add(new Integer(23));
        number.add(new Integer(24));
        number.add(new Integer(27));
        number.add(new Integer(14));
        number.add(new Integer(11));
        number.add(new Integer(9));
        number.add(new Integer(114));
        number.add(new Integer(112));
        number.add(new Integer(1230));

//        List<Integer> sorted = number.stream()
//                .sorted((o1, o2) -> o1.compareTo(o2))
//                .collect(toList());
//        System.out.println(sorted);

//        List<Integer> filter  = number.stream()
//                .filter(num -> num % 3 == 0)
//                .collect(toList());
//        System.out.println(filter);

//        List<Integer> filter  = number.stream()
//                .filter(num -> num % 10 == 0)
//                .collect(toList());
//        System.out.println(filter);

    //  number.forEach(num -> System.out.println(num) );

//        List<Integer> map  = number.stream()
//                .map(value -> value * 3 )
//                .collect(toList());
//
//        System.out.println(map);

    }
}


