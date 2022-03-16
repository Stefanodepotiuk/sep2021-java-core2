package lessons4.cw;

import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Owner {
    private String name;
    private int age;
    private int experience;
}
