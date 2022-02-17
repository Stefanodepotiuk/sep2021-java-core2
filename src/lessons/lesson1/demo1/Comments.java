package lessons.lesson1.demo1;

import lombok.*;

import java.util.ArrayList;

@ToString
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Comments {
    private int id;
    private String name;
    private ArrayList<String> good_word = new ArrayList<>();
}
