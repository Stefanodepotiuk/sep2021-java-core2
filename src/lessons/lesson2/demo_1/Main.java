package lessons.lesson2.demo_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PC> PC = new ArrayList<>();
        PC.add(new UltraBook());
        PC.add(new WorkStation());


        System.out.println(PC);
    }
}


//    Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!
//
//
