import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@DisplayName("Person")
class PersonTest {

    private Person person;


    @Test
    @DisplayName("should call vector add function")
    void move() {
        Vector defaultPosition = mock(Vector.class);
        Vector deplacement = mock(Vector.class);
        Vector position = mock(Vector.class);

        Mockito.when(defaultPosition.add(deplacement)).thenReturn(position);

        person = new Person("John Doe", defaultPosition);

        person.move(deplacement);

        assertEquals(position, person.getPosition());
        Mockito.verify(defaultPosition).add(deplacement);
    }

    @Test
    @DisplayName("should set the position to (0,0)")
    void reset(){
        Vector defaultPosition = mock(Vector.class);

        Person person = new Person("John Doe", defaultPosition);
        person.reset();

        Mockito.verify(defaultPosition).reset();
    }
}