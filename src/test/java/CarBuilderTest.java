import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {

    private CarBuilder carBuilder;

    @BeforeEach
    public void setUp() {
        this.carBuilder = new CarBuilder();
    }

    @Test
    public void shouldThrowExceptionWhenNameIsEmpty() {
        try {
            this.carBuilder
                    .setName("")
                    .setColor("Red")
                    .setManufacturer("Ford")
                    .build();
            fail("Should throw exception when name is empty");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be empty", e.getMessage());
        }
    }

    @Test
    public void shouldThrowExceptionWhenColorIsEmpty() {
        try {
            this.carBuilder
                    .setName("Mustang")
                    .setColor("")
                    .setManufacturer("Ford")
                    .build();
            fail("Should throw exception when color is empty");
        } catch (IllegalArgumentException e) {
            assertEquals("Color cannot be empty", e.getMessage());
        }
    }

    @Test
    public void shouldThrowExceptionWhenManufacturerIsEmpty() {
        try {
            this.carBuilder
                    .setName("Mustang")
                    .setColor("Red")
                    .setManufacturer("")
                    .build();
            fail("Should throw exception when manufacturer is empty");
        } catch (IllegalArgumentException e) {
            assertEquals("Manufacturer cannot be empty", e.getMessage());
        }
    }

    @Test
    public void shouldBuildCarWhenAllFieldsAreValid() {
        Car car = this.carBuilder
                .setName("Mustang")
                .setColor("Red")
                .setManufacturer("Ford")
                .build();
        assertEquals("Mustang", car.getName());
        assertEquals("Red", car.getColor());
        assertEquals("Ford", car.getManufacturer());
        assertFalse(car.getHasSunroof());
        assertFalse(car.getElectric());
    }
}