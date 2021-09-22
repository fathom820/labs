package lifeform;

public abstract class LifeForm {

  // inst var
  private String myName;
  protected int currentLifePoints;
  protected int maxLifePoints;
  private int attackStrength;

  // CONSTR

  /**
   * Construct new life form with predefined name and life
   * @param myName name
   * @param currentLifePoints life
   */
  public LifeForm(String myName, int currentLifePoints) {
    this.myName = myName;
    this.currentLifePoints = currentLifePoints;
    this.maxLifePoints = currentLifePoints;
    this.attackStrength = 0;
  }

  public LifeForm(String myName, int currentLifePoints, int attackStrength) {
    this(myName, currentLifePoints);
    this.attackStrength = attackStrength;
  }

  // func
  public String getName() {
    return myName;
  }

  /**
   * get current life points
   * @return life points
   */
  public int getCurrentLifePoints() {
    return currentLifePoints;
  }

  /**
   * lose life points
   * @param damage amount to lose
   */
  public void takeHit(int damage) {
    currentLifePoints -= damage;
    if (currentLifePoints < 0) {
      currentLifePoints = 0;
    }
  }

  public int getMaxLifePoints() {
    return maxLifePoints;
  }

  // set

  public void setAttackStrength(int attackStrength) {
    this.attackStrength = attackStrength;
  }
}
