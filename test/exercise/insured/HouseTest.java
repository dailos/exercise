package exercise.insured;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {
    private House house;

    @BeforeEach
    void setUp() {
        house = new House(60);
    }

    @Test
    void getArea() {
        assertEquals(60, house.getArea());
    }

    @Test
    void getInsurableId() {
        assertNotNull(house.getInsurableId());
    }

    @Test
    void testNegativeArea() {
        boolean thrown = false;

        try {
            House newHouse = new House(-10);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

}