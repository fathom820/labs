package lifeform;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * Tests the functionality provided by the LifeForm class
 *
 */
public class TestLifeForm {
  /**
   * When a LifeForm is created, it should know its name and how
   * many life points it has.
   */
  @Test
  public void testInitialization() {
    LifeForm entity;
    entity = new MockLifeForm("Bob", 40);
  }

  /**
   * Stores life points
   */
  @Test
  public void testStoresLife() {
    LifeForm entity;
    entity = new MockLifeForm("Bob", 40);
    assertEquals(40, entity.getCurrentLifePoints());
  }

  /**
   * stores name
   */
  @Test
  public void testStoresName() {
    LifeForm entity;
    entity = new MockLifeForm("Bob", 40);
    assertEquals("Bob", entity.getName());
  }

  /**
   * take hit on first attack
   */
  @Test
  public void testTakeHit() {
    LifeForm entity;
    entity = new MockLifeForm("Bob", 40);
    entity.takeHit(10);
    assertEquals(30, entity.getCurrentLifePoints());
  }

  /**
   * life doesnt go below zero
   */
  @Test
  public void testDeath() {
    LifeForm entity;
    entity = new MockLifeForm("Bob", 40);
    entity.takeHit(41);
    assertEquals(0, entity.getCurrentLifePoints());
  }
}
