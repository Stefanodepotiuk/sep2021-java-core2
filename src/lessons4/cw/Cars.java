package lessons4.cw;


import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Cars {
    //   Марка автомобля, потужність двигуна, власник, ціна, рік випуску.

    private int id;
    private String model;
    private int power;
    private int prize;
    private int year;
    private Owner owner;

}

