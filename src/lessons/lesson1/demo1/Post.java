package lessons.lesson1.demo1;

import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Post {

    private int userid;
    private int id;
    private String title;
    private String body;

}
