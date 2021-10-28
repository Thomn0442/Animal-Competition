public class Location {
  private String _name;
  private int _type;

  public Location (String name, int type) {
    this._name = name;
    this._type = type;
  }

  public String name() {
    return this._name;
  }

  public int type() {
    return this._type;
  }
}