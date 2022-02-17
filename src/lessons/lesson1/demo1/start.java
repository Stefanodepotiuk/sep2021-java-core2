package lessons.lesson1.demo1;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

public class start {
    public static void main(String[] args) {



        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("js");
        skills2.add("Go");
        skills2.add("C++");
        Address address = new Address("Zubrivska", "Lviv");
        Company company = new Company("coca","cola");

        User stepan = new User(10, "stepan", "Boy", 25,
                false, skills2, address, Gender.Female, "asd@asd.net",company);
        System.out.println(stepan);




        Post fake = new Post(12,2,"boll","Golf");
        System.out.println(fake);


        ArrayList<String> good_word = new ArrayList<>();
        good_word.add("thank you");
        good_word.add("Please");
        good_word.add("Beautiful");
        Comments comments = new Comments(2,"lola",good_word);
        System.out.println(comments);

    }
}
