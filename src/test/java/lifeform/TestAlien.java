package lifeform;

import org.junit.Assert;
import org.junit.Test;
import recovery.RecoveryLinear;
import static org.junit.Assert.assertEquals;


public class TestAlien {

  @Test
  public void testInitialization() {
    String name = "Xyzzy";
    int currentLifePoints = 10;
    Alien xyzzy = new Alien(name, currentLifePoints);
    if (!(xyzzy.getName().equals(name) && (currentLifePoints == xyzzy.getCurrentLifePoints())))
      Assert.fail();

  }

  @Test
  public void testLinearRecovery() {
    Alien xyy = new Alien("xyy", 10, new RecoveryLinear(2));
    xyy.takeHit(3);
    xyy.recover();
    assertEquals(9, xyy.getCurrentLifePoints());
  }

}
