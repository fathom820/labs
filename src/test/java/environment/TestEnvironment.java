package environment;

import lifeform.LifeForm;
import lifeform.MockLifeForm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestEnvironment {

  @Test
  public void testEmptyCell() {
    Environment e = new Environment(1, 1);
    assertNull(e.getLifeForm(0,0));
  }

  @Test
  public void testAddLifeForm() {
    Environment e = new Environment(2, 3);
    MockLifeForm johnny = new MockLifeForm("Johnny", 100);
    e.addLifeForm(johnny, 0, 1);
    assertEquals(e.getLifeForm(0,1), johnny);
  }

  @Test
  public void testRemoveLifeForm() {
    Environment e = new Environment(2, 3);
    LifeForm johnny = new MockLifeForm("Johnny", 100);
    e.addLifeForm(johnny, 0, 1);

    e.removeLifeForm(0, 1);
    assertNull(e.getLifeForm(0, 1));
  }

  @Test
  public void testOutOfBounds1() {
    Environment e = new Environment(1, 1);
    LifeForm johnny = new MockLifeForm("Johnny", 100);
    try {
      e.addLifeForm(johnny, 0, 1);
      assert false;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      assert true;
    }
  }

  @Test
  public void testOutOfBounds2() {
    Environment e = new Environment(1, 1);
    MockLifeForm johnny = new MockLifeForm("Johnny", 100);
    try {
      e.addLifeForm(johnny, 1, 0);
      assert false;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      assert true;
    }
  }
}
