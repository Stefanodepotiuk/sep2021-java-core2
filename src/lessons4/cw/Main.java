package lessons4.cw;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Створити клас автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//                Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.
//                Створити не менше 7 та не більше 20 машинок.
//                Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//        На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
//        Для початку вкладіть всі наші створені автомобілі в масив cars.
//        Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//        Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//                Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//        Все через stream API

        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars(1, "Audi", 120, 10000, 1998, new Owner("Petro", 54, 2)));
        cars.add(new Cars(2, "Audi", 120, 12000, 2005, new Owner("Ivan", 51, 1)));
        cars.add(new Cars(3, "BMV", 200, 20000, 2010, new Owner("Vasyl", 23, 2)));
        cars.add(new Cars(4, "BMV", 200, 20000, 2010, new Owner("Nazar", 45, 10)));
        cars.add(new Cars(5, "Lada", 100, 2000, 2000, new Owner("Ira", 22, 2)));
        cars.add(new Cars(6, "Volvo", 170, 25000, 2010, new Owner("Olena", 21, 3)));
        cars.add(new Cars(7, "Chevrolet", 180, 15000, 2009, new Owner("Masha", 27, 7)));


        List<Owner> newDriver = new ArrayList<>();
        newDriver.add(new Owner("Orest", 25, 3));
        newDriver.add(new Owner("Bogdan", 29, 4));
        newDriver.add(new Owner("Lida", 34, 14));

        List<Cars> UpCars = cars.stream()
                .peek(car -> {
                    if (car.getId() % 2 == 0) {
                        double UpPower = car.getPower() * 0.1;
                        car.setPower((int) (car.getPower() + UpPower));
                    }
                })
                .peek(car -> {
                    if (car.getOwner().getAge() > 25 || car.getOwner().getExperience() < 5) {
                        car.getOwner().setExperience(car.getOwner().getExperience() + 1);
                    }
                })
                .collect(Collectors.toList());




    }
}
