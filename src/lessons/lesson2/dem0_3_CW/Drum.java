package lessons.lesson2.dem0_3_CW;

import java.util.Objects;

public class Drum implements Instrument{

    private String name;
    private int size;

    public Drum() {
    }

    public Drum(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return size == drum.size && Objects.equals(name, drum.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Play - " + name+ "and it has " + size);
    }




}
