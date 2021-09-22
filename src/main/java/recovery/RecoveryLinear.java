package recovery;

public class RecoveryLinear implements RecoveryBehavior {
  private int rate; // recovery rate

  public RecoveryLinear(int rate) {
    this.rate = rate;
  }

  @Override
  public int calculateRecovery(int currentLife, int maxLife) {
    if (currentLife <= 0) {
      return currentLife;
    }
    currentLife += rate;
    if (currentLife > maxLife) {
      currentLife = maxLife;
    }

    return currentLife;
  }
}
