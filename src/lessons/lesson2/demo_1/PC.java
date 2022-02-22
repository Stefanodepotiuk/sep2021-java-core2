package lessons.lesson2.demo_1;

import java.util.Objects;

abstract class PC {
    private int id;
    private String name;

    public PC() {
    }

    public PC(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return id == pc.id && Objects.equals(name, pc.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PC{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void greeting() {
        System.out.println("I am you PC");
    }
}
