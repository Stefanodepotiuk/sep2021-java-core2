package lessons.lesson2.dem0_3_CW;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Drum drum = new Drum("drum",3);
        Tube tube = new Tube("tube",2);
        Gitar gitar = new Gitar("guitar",6);

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(tube);
        instruments.add(gitar);
        instruments.add(drum);

        for (Instrument instrument : instruments) {

            instrument.play();
        }
            

    }
}


//    Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play()
//        Гитара содержит переменные класса количествоСтрун,
//        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента,
//        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
//
//