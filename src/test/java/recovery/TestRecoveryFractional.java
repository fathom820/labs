package recovery;

import lifeform.Alien;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecoveryFractional {

  /**
   * no recover when not hurt
   */
  @Test
  public void noRecoveryWhenNotHurt() {
    RecoveryFractional rl = new RecoveryFractional(1.0);
    int maxLifePts = 30;
    int result =  rl.calculateRecovery(maxLifePts, maxLifePts);
    assertEquals(maxLifePts, result);
  }

  /**
   * recover just to full health
   */
  @Test
  public void recoverPerfect() {
    RecoveryFractional rl = new RecoveryFractional(0.1);
    Alien ben = new Alien("ben", 10);
    ben.takeHit(1);
    assertEquals(10, rl.calculateRecovery(ben.getCurrentLifePoints(), ben.getMaxLifePoints()));
  }

  /**
   * recover from slight injury
   */
  @Test
  public void recoverNotFull() {
    RecoveryFractional rl = new RecoveryFractional(0.1);
    Alien bobby = new Alien("bobby", 20);
    bobby.takeHit(5);
    assertEquals(17, rl.calculateRecovery(bobby.getCurrentLifePoints(), bobby.getMaxLifePoints()));
  }

  /**
   * cant recover if dead
   */
  @Test
  public void recoverDead() {
    RecoveryFractional rl = new RecoveryFractional(5);
    Alien bobby = new Alien("bobby", 10);
    bobby.takeHit(10);
    assertEquals(0, rl.calculateRecovery(bobby.getCurrentLifePoints(), bobby.getMaxLifePoints()));
  }
}
