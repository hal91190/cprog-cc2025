package fr.uvsq.cprog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehiculeTest {
  private Moto moto;

  @BeforeEach
  public void setUp() {
      moto = new Moto("Yamaha", 2018, false);
  }

  @Test
  public void testMotoYamaha() {
      assertEquals("Broom...", moto.demarrer());
      assertEquals("Yamaha (2018) Moto solo", moto.getInfo());
  }

  // En utilisant Garage
  @Test
  public void testPolymorphismeMoto() {
    String result = new Garage().faireDemarrer(moto);
    assertTrue(result.contains("Broom"));
    assertTrue(result.contains("Moto solo"));
  }
}
