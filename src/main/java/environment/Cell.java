package environment;

import lifeform.LifeForm;

public class Cell {

  // INST VAR
  // entity contained within this cell
  private LifeForm entity = null;


  // FUNCTIONS
  /**
  sets the value of this.entity to a specified lifeform.
  only works if entity == null, otherwise returns false
   * @param entity entity
   */
  public boolean addLifeForm(LifeForm entity) {
    if (this.entity == null) {
      this.entity = entity;
      return true;
    }
    return false;
  }

  // removes life form
  public void removeLifeForm() {
    entity = null;
  }

  // returns life form
  public LifeForm getLifeForm() {
    return entity;
  }

}