import java.util.*;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();

    // Gives a random number for the battlefield
    int loc = rand.nextInt(3);

    // Creates the locations, formated ("[name]", [type]). Type is used for weaknesses
    var locations = new Location[] {
      new Location("desert", 1),
      new Location("swamp", 2),
      new Location("forest", 3)
    };
    var battlefield = locations[loc];
    System.out.println(battlefield.name());

    // Creates the features, formated ("[name]", [attack], [defence])
    var features = new Perk[] {
      new Feature("Claws", 8, 2),
      new Feature("Beak", 10, 0),
      new Feature("Razer Teeth", 10, 0),
      new Feature("Tail", 6, 4),
      new Feature("Wings", 4, 6)
    };

    // Creates the armors, formated ("[name]", [attack], [defence], battlefield)
    var armors = new Perk[] {
      new Armor("Fur", 4, 10, battlefield),
      new Armor("Scales", 4, 10, battlefield),
      new Armor("Hide", 4, 10, battlefield)
    };

    System.out.println(armors[1].defence());
    System.out.println(features);
  }
}