package lifeform;

public class Human extends LifeForm {
  private int armorPoints;

  /**
   * Creates a human instance with predefined name, life points, and armor
   * @param myName name
   * @param currentLifePoints life
   * @param armorPoints armor
   */
  public Human(String myName, int currentLifePoints, int armorPoints) {
    super(myName, currentLifePoints);
    if (armorPoints < 0) {
      armorPoints = 0;
    }

    this.armorPoints = armorPoints;
    super.setAttackStrength(5);
  }

  public Human(String name, int currentLifePoints) {
    super(name, currentLifePoints);
  }

  /**
   * override to account for armor
   * @param damage damage
   * @Override
   */
  public void takeHit(int damage) {

  }

  // setters

  /**
   * Set armor points
   * @param armorPoints armor points
   */
  public void setArmorPoints(int armorPoints) {
    if (armorPoints < 0) {
      armorPoints = 0;
    }
    this.armorPoints = armorPoints;
  }

  // getters
  public int getArmorPoints() {
    return armorPoints;
  }
}
