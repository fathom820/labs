package recovery;

import lifeform.Alien;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestRecoveryLinear {

  /**
   * no recovery @ full health
   */
  @Test
  public void noRecoveryWhenNotHurt() {
    RecoveryLinear rl = new RecoveryLinear(3);
    int maxLifePts = 30;
    int result =  rl.calculateRecovery(maxLifePts, maxLifePts);
    assertEquals(maxLifePts, result);
  }

  /**
   * recover from slight injury
   */
  @Test
  public void recoverNotFull() {
    RecoveryLinear rl = new RecoveryLinear(1);
    Alien bobby = new Alien("bobby", 10);
    bobby.takeHit(2);
    assertEquals(9, rl.calculateRecovery(bobby.getCurrentLifePoints(), bobby.getMaxLifePoints()));
  }

  /**
   * no overhealing
   */
  @Test
  public void recoverOverMax() {
    RecoveryLinear rl = new RecoveryLinear(5);
    Alien bobby = new Alien("bobby", 10);
    bobby.takeHit(1);
    assertEquals(10, rl.calculateRecovery(bobby.getCurrentLifePoints(), bobby.getMaxLifePoints()));
  }

  /**
   * cant recover if dead
   */
  @Test
  public void recoverDead() {
    RecoveryLinear rl = new RecoveryLinear(5);
    Alien bobby = new Alien("bobby", 10);
    bobby.takeHit(10);
    assertEquals(0, rl.calculateRecovery(bobby.getCurrentLifePoints(), bobby.getMaxLifePoints()));
  }

  /**
   * recover just to full health
   */
  @Test
  public void recoverPerfect() {
    RecoveryLinear rl = new RecoveryLinear(1);
    Alien ben = new Alien("ben", 10);
    ben.takeHit(1);
    assertEquals(10, rl.calculateRecovery(ben.getCurrentLifePoints(), ben.getMaxLifePoints()));
  }
}
