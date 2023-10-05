import java.util.Objects;

public class CarBuilder {
    private final Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public Car build() {
        if (Objects.equals(this.car.getName(), "")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (Objects.equals(this.car.getColor(), "")) {
            throw new IllegalArgumentException("Color cannot be empty");
        }

        if (Objects.equals(this.car.getManufacturer(), "")) {
            throw new IllegalArgumentException("Manufacturer cannot be empty");
        }

        return this.car;
    }

    public CarBuilder setName(String name) {
        this.car.setName(name);
        return this;
    }

    public CarBuilder setColor(String color) {
        this.car.setColor(color);
        return this;
    }

    public CarBuilder setManufacturer(String manufacturer) {
        this.car.setManufacturer(manufacturer);
        return this;
    }

    public CarBuilder setHasSunroof(Boolean hasSunroof) {
        this.car.setHasSunroof(hasSunroof);
        return this;
    }

    public CarBuilder setElectric(Boolean isElectric) {
        this.car.setElectric(isElectric);
        return this;
    }
}
