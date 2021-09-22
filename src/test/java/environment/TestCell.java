package environment;

import lifeform.LifeForm;
import lifeform.MockLifeForm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * The test cases for the Cell class
 *
 */
public class TestCell {
  /**
   * At initialization, the Cell should be empty and not contain a
   * LifeForm.
   */
  @Test
  public void testInitialization() {
    Cell cell = new Cell();
    assertNull(cell.getLifeForm());
  }

  /**
   * Checks to see if we change the LifeForm held by the Cell that
   * getLifeForm properly responds to this change.
   */
  @Test
  public void testAddLifeForm() {
    LifeForm bob = new MockLifeForm("Bob", 40);
    Cell cell = new Cell();
    // The cell is empty so this should work.
    boolean success = cell.addLifeForm(bob);
    assertTrue(success);
    assertEquals(bob,cell.getLifeForm());

  }

  @Test
  public void testFailAddLifeForm() {
    LifeForm fred = new MockLifeForm("Fred", 40);
    LifeForm bob = new MockLifeForm("Bob", 40);
    Cell cell = new Cell();
    boolean success = cell.addLifeForm(bob);

    // The cell is not empty so this should fail.
    success = cell.addLifeForm(fred);
    assertFalse(success);
    assertEquals(bob,cell.getLifeForm());
  }

  @Test
  public void testRemoveLifeForm() {
    Cell c = new Cell();
    c.addLifeForm(new MockLifeForm("Harold", 1));
    c.removeLifeForm();
    assertNull(c.getLifeForm());
  }
}