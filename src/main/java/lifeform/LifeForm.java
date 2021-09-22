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

  /**
   * Construct new lifeform with predifined name, life, attack strength
   * @param myName name
   * @param currentLifePoints life
   * @param attackStrength attack strength
   */
  public LifeForm(String myName, int currentLifePoints, int attackStrength) {
    this(myName, currentLifePoints);
    this.attackStrength = attackStrength;
  }


  // func

  /**
   * Makes an enemy lifeform take damage equivalent to this lifeform's attack strength.
   * If this lifeform is dead, it will deal no damage
   * @param entity
   */
    public void attack(LifeForm entity) {
      if (this.currentLifePoints > 0) {
        entity.takeHit(this.attackStrength);
      }

    }

  // get
  /**
   * Get name
   * @return myName
   */
  public String getName() {
    return myName;
  }

  /**
   * Get current life points
   * @return currentLifePoints
   */
  public int getCurrentLifePoints() {
    return currentLifePoints;
  }

  /**
   * Lose life points
   * Life points will not go below 0
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

  public int getAttackStrength() {
    return attackStrength;
  }

  // set
  public void setAttackStrength(int attackStrength) {
    this.attackStrength = attackStrength;
  }
}
