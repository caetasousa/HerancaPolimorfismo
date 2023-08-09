package entidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregoTercerizadoTest {

    Emprego emprego = new EmpregoTercerizado("Eduardo", 10, 200.00, 1.1);

    @Test
    void pagamento() {
        assertEquals(2200.00, emprego.pagamento());
    }
}