package lessons.lesson2.dem0_3_CW;

import java.util.Objects;

public class Tube implements Instrument {

    private String name;
    private int diameter;

    @Override
    public String toString() {
        return "Tube{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tube tube = (Tube) o;
        return diameter == tube.diameter && Objects.equals(name, tube.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, diameter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Tube(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public Tube() {
    }

    @Override
    public void play() {
        System.out.println("Play - " + name + "and it has " + diameter);
    }




}
