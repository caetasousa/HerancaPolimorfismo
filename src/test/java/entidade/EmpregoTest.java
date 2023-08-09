package entidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregoTest {

    Emprego emprego = new Emprego("Eduardo", 10, 200.00);

    @Test
    void pagamento() {
        assertEquals(2000.00, emprego.pagamento());
    }
}