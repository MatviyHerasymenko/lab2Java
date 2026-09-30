import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.Warning;


class PersonTest {
    @Test
    void equalsContractIsCorrect() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}
