package lifeform;

import org.junit.Assert;
import org.junit.Test;

public class TestHuman {

  /**
   * Test if human can be initialized and if armor is at least 0
   */
  @Test
  public void testInitialization() {
    String name = "Dave";
    int currentLifePoints = 10;
    int armor = 0;
    Human dave = new Human(name, currentLifePoints, armor);
  }

  /**
   * Test if set armor works
   */
  @Test
  public void testSetArmor() {
    String name = "Dave";
    int currentLifePoints = 10;
    int armor = 0;
    Human dave = new Human(name, currentLifePoints);
    dave.setArmorPoints(armor);
  }

  /**
   * Test if get armor works
   */
  @Test
  public void testGetArmor() {
    String name = "Dave";
    int currentLifePoints = 10;
    int armor = 0;
    Human dave = new Human(name, currentLifePoints);
    dave.setArmorPoints(armor);
    // if any of the arguments passed don't end up as Dave's attributes, fail the test
    if(dave.getArmorPoints() != armor) {
      Assert.fail();
    }
  }

  /**
   * Test if armor is negative
   */
  @Test
  public void testArmorNegative() {
    String name = "Dave";
    int currentLifePoints = 10;
    int armor = -1;
    Human dave = new Human(name, currentLifePoints);
    dave.setArmorPoints(armor);
    // if any of the arguments passed don't end up as Dave's attributes, fail the test
    if(dave.getArmorPoints() < 0) {
      Assert.fail();
    }
  }
}