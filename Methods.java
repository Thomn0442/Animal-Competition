public class Methods{
  // Takes the name of the Armor and the Location, and returns the defence the Armor will give
  public static int EnvironmentOnDefence(String name, Location loc) {
    if (name.equalsIgnoreCase("Fur") && (loc.type() == 1 || loc.type() == 2)) {
      return 5;
      }

    if (name.equalsIgnoreCase("Scales") && (loc.type() == 1 || loc.type() == 3)) {
      return 5;
      }
    
    if (name.equalsIgnoreCase("Hide") && (loc.type() == 2 || loc.type() == 3)) {
      return 5;
      }
  
    return 10;
  }

  public static int EnvironmentOnAttack(String name, Location loc) {
    if (name.equalsIgnoreCase("Fur") && loc.type() == 1) {
      return 2;
      }

    if (name.equalsIgnoreCase("Scales") && loc.type() == 3) {
      return 2;
      }
    
    if (name.equalsIgnoreCase("Hide") && loc.type() == 2) {
      return 2;
      }
  
    return 4;
  }
}