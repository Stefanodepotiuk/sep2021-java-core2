package lessons.lesson2.demo_1;

import java.util.Objects;

public class UltraBook extends Laptop {
    private String model;

    public UltraBook() {
    }

    public UltraBook(int id, String name, String service, String model) {
        super(id, name, service);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UltraBook ultraBook = (UltraBook) o;
        return Objects.equals(model, ultraBook.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "model='" + model + '\'' +
                '}';
    }
}
