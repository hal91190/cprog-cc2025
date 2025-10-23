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


/*
// SI vous utilisez garage 

public class VehiculeTest {
  @Test
  public void testPolymorphismeMoto() {
    Moto m = new Moto("Yamaha", 2018, false);
    String result = new Garage().faireDemarrer(m);
    assertTrue(result.contains("Broom! La moto Yamaha démarre."));
    assertTrue(result.contains("Moto solo"));
  }
}

 */

