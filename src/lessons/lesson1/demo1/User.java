package lessons.lesson1.demo1;

import lombok.*;

import java.util.ArrayList;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor



public class User {

   private int id;
   private String name;
   private String username;
   private int age;
   private boolean status;
   private ArrayList<String> skills = new ArrayList<>();
   private Address address;
   private Gender gender;
   private String email;
   private Company company;
}



