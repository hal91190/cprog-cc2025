package fr.uvsq.cprog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VehiculeTest {
    @Test
    public void testMotoYamaha() {
        Moto moto = new Moto("Yamaha", 2018, false);
        assertEquals("Broom...", moto.demarrer());
        assertEquals("Yamaha (2018) Moto solo", moto.getInfo());
    }
}
