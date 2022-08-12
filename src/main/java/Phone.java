import java.util.Objects;

public class Phone <T> {
    private T number;
    private T model;

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public T getNumber() {
        return number;
    }

    public T getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone<?> phone = (Phone<?>) o;
        return Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model);
    }

    public Phone(T number, T model) {
        this.number = number;
        this.model = model;
    }
}
