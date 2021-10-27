public abstract class Perk {
  private int _attack;
  private int _defence;
  private String _name;

  // A constructor that takes the attributes of the Perk
  protected Perk(String name, int atk, int def){
    this._name = name;
    this._attack = atk;
    this._defence = def;
  }
  
  public String name() {
    return this._name;
  }

  public int attack() {
    return this._attack;
  }

  public int defence() {
    return this._defence;
  }
  
  // Effect of the environment on the attack of the animal
  //public abstract int environmentOnAttack;

  // Effect of the environment on the defance of the amimal
  //public abstract int environmentOnDefence;

}