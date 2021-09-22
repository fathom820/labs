package recovery;

public class RecoveryFractional implements RecoveryBehavior {
  double rate;

  public RecoveryFractional(double rate) {
    this.rate = rate;
  }

  @Override
  public int calculateRecovery(int currentLife, int maxLife) {
    currentLife += Math.ceil(rate * (double)currentLife);
    if (currentLife > maxLife) {
      currentLife = maxLife;
    }

    return currentLife;
  }
}
