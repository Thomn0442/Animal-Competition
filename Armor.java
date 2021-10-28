public class Armor extends Perk {
  Location location;
  public Armor(String name, int atk, int def, Location loc) {
    super(name, atk, def);
    this.location = loc;
  }

  public int attack() {
    return Methods.EnvironmentOnAttack(this.name(), this.location);
  }

  public int defence() {
    return Methods.EnvironmentOnDefence(this.name(), this.location);
  }
}