package recovery;

import lifeform.Alien;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecoveryNone {

  @Test
  public void testFullHealth() {
    Alien trebek = new Alien("Trebek", 10);
    RecoveryNone rn = new RecoveryNone();
    assertEquals(trebek.getMaxLifePoints(), rn.calculateRecovery(trebek.getCurrentLifePoints(), trebek.getMaxLifePoints()));
  }

  @Test
  public void testHurtNoRegen() {
    Alien florgus = new Alien("Florgus", 10);
    florgus.takeHit(5);
    RecoveryNone rn = new RecoveryNone();
    assertEquals(florgus.getCurrentLifePoints(), rn.calculateRecovery(florgus.getCurrentLifePoints(), florgus.getMaxLifePoints()));
  }
}
