import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Person")
class PersonTest {

    private Person person;


    @Test
    @DisplayName("should call vector add function")
    void move() {
        person = new Person("John Doe", new Vector(10, 20));

        person.move(new Vector(-5, 20));
        person.move(new Vector(-3, -4));

        assertEquals(new Vector(2, 36), person.getPosition());
    }
}