package exercise.products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductFactoryTest {
    @BeforeEach
    void setUp() {

    }

    @Test
    void getProduct() {
        Product product = ProductFactory.getProduct("compact");
        assertEquals("HouseHoldCompactId", product.getProductId().toString());
        Product product2 = ProductFactory.getProduct("optimal");
        assertEquals("HouseHoldOptimalId", product2.getProductId().toString());

        boolean thrown = false;
        try {
            Product product3 = ProductFactory.getProduct("randomString");
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

}