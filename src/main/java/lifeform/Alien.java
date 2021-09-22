package lifeform;

import recovery.RecoveryBehavior;
import recovery.RecoveryLinear;

public class Alien extends LifeForm {

  private RecoveryBehavior rb;

  public Alien(String myName, int currentLifePoints) {
    super(myName, currentLifePoints);
  }

  public Alien(String myName, int currentLifePoints, RecoveryBehavior rb) {
    this(myName, currentLifePoints);
    this.rb = rb;
  }

  protected void recover() {
    currentLifePoints = rb.calculateRecovery(currentLifePoints, maxLifePoints);
  }


}
