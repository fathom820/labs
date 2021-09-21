package lifeform;

public class LifeForm {

  // inst var
  private String myName;
  private int currentLifePoints;

  // CONSTR
  public LifeForm(String myName, int currentLifePoints) {
    this.myName = myName;
    this.currentLifePoints = currentLifePoints;
  }

  // func
  public String getName() {
    return myName;
  }

  public int getCurrentLifePoints() {
    return currentLifePoints;
  }
}
