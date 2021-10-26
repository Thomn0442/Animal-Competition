public class Feature extends Perk {
  private int _attack;
  private int _defence;

  // A constructor that takes the attributes of the Feature
  protected Feature(String name, int atk, int def){
    this._attack = atk;
    this._defence = def;
  }
  
  public int attack() {
    return this._attack;
  }

  public int defence() {
    return this._defence;
  }
}