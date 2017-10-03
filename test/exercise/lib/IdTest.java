package exercise.lib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class IdTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("id should be stored")
    void testToString() {
        String randomId = "randomId";
        Id id = new Id(randomId);
        assertEquals(randomId, id.toString());
    }

    @Test
    @DisplayName("id should not be empty")
    void testIdNotEmpty() {
        assertNotNull(new Id().toString());
    }

}