package lessons.lesson2.dem0_3_CW;

import java.util.Objects;

public class Gitar implements Instrument {

    private String name;
    private int stings;

    public Gitar() {
    }

    public Gitar(String name, int stings) {
        this.name = name;
        this.stings = stings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStings() {
        return stings;
    }

    public void setStings(int stings) {
        this.stings = stings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gitar gitar = (Gitar) o;
        return stings == gitar.stings && Objects.equals(name, gitar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stings);
    }

    @Override
    public String toString() {
        return "Gitar{" +
                "name='" + name + '\'' +
                ", stings=" + stings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Play - " + name + " and it has " + stings );
    }

}
