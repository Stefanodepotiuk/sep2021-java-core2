package lessons.lesson2.demo_1;

import java.util.Objects;

public class Laptop extends PC{
    private String service;

    public Laptop() {
    }

    public Laptop(int id, String name, String service) {
        super(id, name);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "service='" + service + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(service, laptop.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), service);
    }
}
