import java.util.*;
import java.util.Random;

public class Child extends Person {
  public static HashMap<String, Child> children = new HashMap<String, Child>();

  public Child (String n, Trait s, Trait r, Trait h, Trait e, Trait t, Trait i) {
    super(n,s,r,h,e,t,i);
    children.put(name, this);
  }

  public static void listChildren() {
    for (String i : children.keySet()) {
      System.out.println(i);
    }
  }

  public void determineTraits(FemaleParent f, MaleParent m) {
    Trait trait;

    sex = determineSex();

    System.out.print("Congrats! It's a ");
    if (sex.phenotype.equals("female")) {
      System.out.print("girl!");
    }
    else if (sex.phenotype.equals("male")) {
      System.out.print("boy!");
    }
    
    System.out.print("\nWhat do you want to name the child?: ");
    name = input.nextLine();

    if (f.race.phenotype.equals(m.race.phenotype)){
      race = new Trait("race", m.race);
    }
    else {
      String newRacePhenotype = m.race + "-" + f.race;
      race = new Trait("race", newRacePhenotype);    
    }

    trait = f.hairColor;
    trait.cross(m.hairColor);

    trait = f.eyeColor;
    trait.cross(m.eyeColor);

    trait = f.height;
    trait.cross(m.height);

    trait = f.IQ;
    trait.cross(m.IQ);

    child = new Child(name, sex, race, hairColor, eyeColor, height, IQ);
    
    System.out.println("The following are the child's qualities: ");
    child.seeTraits();
  }
}