import java.util.HashMap;

public abstract class Person {
  public String name;
  public Trait sex, race, hairColor, eyeColor, height, IQ;
  public static HashMap<String, Person> persons = new HashMap<String, Person>();

  protected Person(String n, Trait s, Trait r, Trait h, Trait e, Trait t, Trait i) {
    name = n;
    sex = s;
    race = r;
    hairColor = h;
    eyeColor = e;
    height = t;
    IQ = i;
    persons.put(name, this);
  }

  public static void listPeople() {
    for (String i : persons.keySet()) {
      System.out.println(i);
    }
  }

  public static void removePerson(String n) {
    persons.remove(n);
  }

  public void seeTraits() {
    System.out.println("Sex: " + sex.phenotype +
      "\nRace: " + race.phenotype +
      "\nHair Color: " + hairColor.phenotype + 
      "\nEye Color: " + eyeColor.phenotype + 
      "\nHeight: " + height.phenotype + 
      "\nIQ: " + IQ.phenotype);
  }
}